package dao;

import model.Voter;
import utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VoterDao {

    public void addVoter(Voter voter) throws SQLException {
        String query = "INSERT INTO voters (name, email, password) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, voter.getName());
            stmt.setString(2, voter.getEmail());
            stmt.setString(3, voter.getPassword());
            stmt.executeUpdate();
        }
    }

    public List<Voter> getAllVoters() throws SQLException {
        List<Voter> voters = new ArrayList<>();
        String query = "SELECT * FROM voters";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Voter voter = new Voter(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                voters.add(voter);
            }
        }
        return voters;
    }

    public void deleteCandidate(String name, String email, String password) throws SQLException {
        String query = "DELETE FROM candidates WHERE name = ? AND email = ? AND password = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);
            stmt.executeUpdate();
        }
    }

}
