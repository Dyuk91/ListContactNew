package service.crudContact;

import model.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactCrudOperationImpl implements CrudOperation {

    private final List<Contact> list = new ArrayList<>();

    @Override
    public void add(Contact contact) {

        list.add(contact);

    }

    @Override
    public void delete(Contact contact) {

        list.remove(contact);

    }

    @Override
    public void delete(Long id) {

        for (Contact contact : list) {
            if (contact.getId().equals(id)) {
                list.remove(contact);
            }
        }

    }

    @Override
    public List<Contact> findAll() {

        return list;

    }

    @Override
    public Contact update(Contact newContact) {

        if (newContact.getId() == null) {
            throw new NullPointerException(newContact.toString());
        }

        for (Contact contact : list) {
            if (contact.getId().equals(newContact.getId())) {
                list.remove(contact);
                list.add(newContact);
            }


        }
        return newContact;
    }

    @Override
    public Contact findById(Long id) {

        for (Contact contact : list){
            if (contact.getId().equals(id)) {
                return contact;
            }

        }

        return null;
    }
}
