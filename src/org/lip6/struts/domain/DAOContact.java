package org.lip6.struts.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.lip6.struts.domain.Contact;

public class DAOContact {
	private final static String RESOURCE_JDBC = "java:comp/env/jdbc/ProjetStruts";

	public List<Contact> find() throws NamingException, SQLException {

		final Context lContext = new InitialContext();
		final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
		final Connection lConnection = lDataSource.getConnection();

		String requete = "SELECT * FROM contact";
		List<Contact> listeContact = new ArrayList<Contact>();
		ResultSet rs = lConnection.createStatement().executeQuery(requete);

		while (rs.next()) {
			Contact contact = new Contact();
			contact.setIdContact(rs.getInt("idContact"));
			contact.setNom(rs.getString("nom"));
			contact.setPrenom(rs.getString("prenom"));
			contact.setEmail(rs.getString("email"));
			contact.setVille(rs.getString("ville"));
			contact.setRue(rs.getString("rue"));
			contact.setCodePostal(rs.getInt("codePostal"));
			contact.setPays(rs.getString("pays"));
			contact.setEntreprise(rs.getBoolean("entreprise"));
			contact.setNumTel(rs.getString("numTel"));
			contact.setNumFixe(rs.getString("numFixe"));
			contact.setIdGroupe(new GroupeContact(rs.getInt("idGroupe")));
			listeContact.add(contact);

		}

		return listeContact;

	}

	public List<Contact> findOffice() throws NamingException, SQLException {

		final Context lContext = new InitialContext();
		final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
		final Connection lConnection = lDataSource.getConnection();

		String requete = "SELECT * FROM contact where idGroupe=3";
		List<Contact> listeContact = new ArrayList<Contact>();
		ResultSet rs = lConnection.createStatement().executeQuery(requete);

		while (rs.next()) {
			Contact contact = new Contact();
			contact.setIdContact(rs.getInt("idContact"));
			contact.setNom(rs.getString("nom"));
			contact.setPrenom(rs.getString("prenom"));
			contact.setEmail(rs.getString("email"));
			contact.setVille(rs.getString("ville"));
			contact.setRue(rs.getString("rue"));
			contact.setCodePostal(rs.getInt("codePostal"));
			contact.setPays(rs.getString("pays"));
			contact.setEntreprise(rs.getBoolean("entreprise"));
			contact.setNumTel(rs.getString("numTel"));
			contact.setNumFixe(rs.getString("numFixe"));
			contact.setIdGroupe(new GroupeContact(rs.getInt("idGroupe")));
			listeContact.add(contact);

		}

		return listeContact;

	}

	public List<Contact> findFriends() throws NamingException, SQLException {

		final Context lContext = new InitialContext();
		final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
		final Connection lConnection = lDataSource.getConnection();

		String requete = "SELECT * FROM contact where idGroupe=2";
		List<Contact> listeContact = new ArrayList<Contact>();
		ResultSet rs = lConnection.createStatement().executeQuery(requete);

		while (rs.next()) {
			Contact contact = new Contact();
			contact.setIdContact(rs.getInt("idContact"));
			contact.setNom(rs.getString("nom"));
			contact.setPrenom(rs.getString("prenom"));
			contact.setEmail(rs.getString("email"));
			contact.setVille(rs.getString("ville"));
			contact.setRue(rs.getString("rue"));
			contact.setCodePostal(rs.getInt("codePostal"));
			contact.setPays(rs.getString("pays"));
			contact.setEntreprise(rs.getBoolean("entreprise"));
			contact.setNumTel(rs.getString("numTel"));
			contact.setNumFixe(rs.getString("numFixe"));
			contact.setIdGroupe(new GroupeContact(rs.getInt("idGroupe")));
			listeContact.add(contact);

		}

		return listeContact;

	}

	public List<Contact> findFamily() throws NamingException, SQLException {

		final Context lContext = new InitialContext();
		final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
		final Connection lConnection = lDataSource.getConnection();

		String requete = "SELECT * FROM contact where idGroupe=1";
		List<Contact> listeContact = new ArrayList<Contact>();
		ResultSet rs = lConnection.createStatement().executeQuery(requete);

		while (rs.next()) {
			Contact contact = new Contact();
			contact.setIdContact(rs.getInt("idContact"));
			contact.setNom(rs.getString("nom"));
			contact.setPrenom(rs.getString("prenom"));
			contact.setEmail(rs.getString("email"));
			contact.setVille(rs.getString("ville"));
			contact.setRue(rs.getString("rue"));
			contact.setCodePostal(rs.getInt("codePostal"));
			contact.setPays(rs.getString("pays"));
			contact.setEntreprise(rs.getBoolean("entreprise"));
			contact.setNumTel(rs.getString("numTel"));
			contact.setNumFixe(rs.getString("numFixe"));
			contact.setIdGroupe(new GroupeContact(rs.getInt("idGroupe")));
			listeContact.add(contact);

		}

		return listeContact;

	}

	public String deleteContact(int id) {
		try {
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection = lDataSource.getConnection();

			// adding a new contact
			final PreparedStatement lPreparedStatementDelete = lConnection
					.prepareStatement("DELETE FROM contact WHERE idContact=?");
			lPreparedStatementDelete.setInt(1, id);
			lPreparedStatementDelete.executeUpdate();

			return "success";

		} catch (NamingException e) {

			return e.getMessage();

		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public List<Contact> findById(int id) throws NamingException, SQLException {

		final Context lContext = new InitialContext();
		final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
		final Connection lConnection = lDataSource.getConnection();
		String requete = "select * from contact where idContact=" + id;

		ResultSet rs = lConnection.createStatement().executeQuery(requete);

		List<Contact> listeContact = new ArrayList<Contact>();
		while (rs.next()) {
			Contact contact = new Contact();
			contact.setIdContact(rs.getInt("idContact"));
			contact.setNom(rs.getString("nom"));
			contact.setPrenom(rs.getString("prenom"));
			contact.setEmail(rs.getString("email"));
			contact.setVille(rs.getString("ville"));
			contact.setRue(rs.getString("rue"));
			contact.setCodePostal(rs.getInt("codePostal"));
			contact.setPays(rs.getString("pays"));
			contact.setEntreprise(rs.getBoolean("entreprise"));
			contact.setNumTel(rs.getString("numTel"));
			contact.setNumFixe(rs.getString("numFixe"));
			contact.setIdGroupe(new GroupeContact(rs.getInt("idGroupe")));

			listeContact.add(contact);
		}

		return listeContact;

	}

	public String addContact(int idContact, String nom, String prenom, String email, String ville, String rue,
			int codePostal, String pays, Boolean entreprise, String numTel, String numFixe, int idGroupe) {
		try {
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection = lDataSource.getConnection();

			// adding a new contact
			final PreparedStatement lPreparedStatementCreation = lConnection.prepareStatement(
					"INSERT INTO contact(idContact,nom, prenom, email,ville,rue,codePostal,pays,entreprise,numTel,numFixe,idGroupe) VALUES(?, ?, ?, ?,?,?,?,?,?,?,?,?)");

			lPreparedStatementCreation.setLong(1, idContact);
			lPreparedStatementCreation.setString(2, nom);
			lPreparedStatementCreation.setString(3, prenom);
			lPreparedStatementCreation.setString(4, email);
			lPreparedStatementCreation.setString(5, ville);
			lPreparedStatementCreation.setString(6, rue);
			lPreparedStatementCreation.setInt(7, codePostal);
			lPreparedStatementCreation.setString(8, pays);
			lPreparedStatementCreation.setBoolean(9, entreprise);
			lPreparedStatementCreation.setString(10, numTel);
			lPreparedStatementCreation.setString(11, numFixe);
			lPreparedStatementCreation.setInt(12, idGroupe);

			lPreparedStatementCreation.executeUpdate();

			return "success";
		} catch (NamingException e) {

			return "NamingException : " + e.getMessage();

		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();

		}
	}

	public String updateContact(int idContact, String nom, String prenom, String email, String ville, String rue,
			int codePostal, String pays, Boolean entreprise, String numTel, String numFixe, String idGroupe) {
		try {
			final Context lContext = new InitialContext();
			final DataSource lDataSource = (DataSource) lContext.lookup(RESOURCE_JDBC);
			final Connection lConnection = lDataSource.getConnection();

			final PreparedStatement lPreparedStatementCreation = lConnection.prepareStatement(
					"UPDATE contact set nom=? , prenom=?, email=?, ville=?, rue=?, codePostal=?, pays=?, entreprise=?, numTel=?, numFixe=?, idGroupe=? where idContact=?");

			lPreparedStatementCreation.setString(1, nom);
			lPreparedStatementCreation.setString(2, prenom);
			lPreparedStatementCreation.setString(3, email);
			lPreparedStatementCreation.setString(4, ville);
			lPreparedStatementCreation.setString(5, rue);
			lPreparedStatementCreation.setInt(6, codePostal);
			lPreparedStatementCreation.setString(7, pays);
			lPreparedStatementCreation.setBoolean(8, entreprise);
			lPreparedStatementCreation.setString(9, numTel);
			lPreparedStatementCreation.setString(10, numFixe);
			lPreparedStatementCreation.setString(11, idGroupe);
			lPreparedStatementCreation.setInt(12, idContact);

			lPreparedStatementCreation.executeUpdate();

			return "success";
		} catch (NamingException e) {

			return "NamingException : " + e.getMessage();

		} catch (SQLException e) {
			return "SQLException : " + e.getMessage();

		}
	}

}