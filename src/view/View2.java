package view;

import model.Contact;

import java.util.List;

public interface View2 {

    String ok ();

    String error ();

    String listView(List<Contact> list);
}
