package view;

import model.Contact;

import java.util.List;

public class View3Impl implements View2 {
    @Override
    public String ok() {
        return "##ok##";
    }

    @Override
    public String error() {
        return "## что-то пошло не так ##";
    }

    @Override
    public String listView(List<Contact> list) {

        StringBuilder contactView = new StringBuilder();

        for (Contact contact : list){
            contactView.append("##");
            contactView.append(contact.toString());
            contactView.append("##");
            contactView.append("\n");
        }
        return String.valueOf(contactView);
    }
}
