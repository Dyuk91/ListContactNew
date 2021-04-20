package controller;

import model.Contact;

import java.util.List;

public interface Controller {

    String add(Contact contact);

    String delete(Contact contact);

    String delete(Long id);

    String findAll();

    String update(Contact oldContact);

    String findById (Long id);
}
