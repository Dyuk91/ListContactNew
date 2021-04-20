package service;

import model.Contact;

import java.util.List;

public interface ContactService {

    void add(Contact contact);

    void delete(Contact contact);

    void delete(Long id);

    List<Contact> findAll();

    Contact update(Contact oldContact);

    Contact findById (Long id);
}
