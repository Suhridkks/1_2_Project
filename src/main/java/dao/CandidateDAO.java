package dao;

import model.Candidate;
import utils.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO {

    public void addCandidate(Candidate candidate) throws SQLException {
        String query = "INSERT INTO candidates (name, email, password) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, candidate.getName());
            stmt.setString(2, candidate.getEmail());
            stmt.setString(3, candidate.getPassword());
            stmt.executeUpdate();
        }
    }

    public List<Candidate> getAllCandidates() throws SQLException {
        List<Candidate> candidates = new ArrayList<>();
        String query = "SELECT * FROM candidates";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Candidate candidate = new Candidate(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                candidates.add(candidate);
            }
        }
        return candidates;
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
