package controller;

import model.Contact;
import service.ContactService;
import service.ContactServiceImpl;
import view.ContactView2Impl;
import view.View2;
import view.View3Impl;

import java.util.List;

public class ContactControllerImpl implements Controller {

    private ContactService contactService;
    private View2 contactView;

    public ContactControllerImpl(ContactService contactService, View2 contactView) {
        this.contactService = contactService;
        this.contactView = contactView;
    }

    @Override
    public String add(Contact contact) {

        contactService.add(contact);

        return contactView.ok();
    }

    @Override
    public String delete(Contact contact) {

        contactService.delete(contact);
        return contactView.ok();
    }

    @Override
    public String delete(Long id) {

        contactService.delete(id);

        return contactView.ok();
    }

    @Override
    public String findAll() {

        List<Contact> list = contactService.findAll();
        return contactView.listView(list);
    }

    @Override
    public String update(Contact newContact) {

        contactService.update(newContact);
        return contactView.ok();
    }

    @Override
    public String findById(Long id) {

       Contact contact = contactService.findById(id);
        if (contact == null){
            return contactView.error();
        }
        return contactView.ok();
    }
}
