package service;

import model.Contact;
import service.crudContact.ContactCrudOperationImpl;
import service.crudContact.CrudOperation;

import java.util.List;

public class ContactServiceImpl implements ContactService {

    private CrudOperation contactOperation = new ContactCrudOperationImpl();

    @Override
    public void add(Contact contact) {

        if (contact.getId().equals(1L)){
            throw new IllegalArgumentException("недопустимый id");
        }

        contactOperation.add(contact);

    }

    @Override
    public void delete(Contact contact) {

        contactOperation.delete(contact);

    }

    @Override
    public void delete(Long id) {

        contactOperation.delete(id);

    }

    @Override
    public List<Contact> findAll() {


        return contactOperation.findAll();
    }

    @Override
    public Contact update(Contact newContact) {

        return contactOperation.update(newContact);
    }

    @Override
    public Contact findById(Long id) {

        return contactOperation.findById(id);
    }
}
