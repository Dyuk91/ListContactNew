
import controller.ContactControllerImpl;
import controller.Controller;
import model.Contact;
import service.ContactService;
import service.ContactServiceImpl;
import service.clientException.ClientException;
import view.ContactView2Impl;
import view.View2;
import view.View3Impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

//        ContactManager ms = ContactManager.getInstance();

//        ContactDAO dao = ContactDAOFactory.getContactDAO();
//
//        dao.unloadList();
//
//        View mainMenu = new View();
//
//        mainMenu.viewMainMenu();

        View2 contactViewOne;
        ContactService contactService = new ContactServiceImpl();
//        View2 contactViewTwo = new View3Impl();

        if (args[0].equals("1")){
            contactViewOne =  new ContactView2Impl();
        }else {
            contactViewOne = new View3Impl();
        }

        Controller contactController = new ContactControllerImpl(contactService, contactViewOne);


        System.out.println("***************************************************");
        System.out.println("///////////////    ГЛАВНОЕ МЕНЮ    ///////////////");
        System.out.println("***************************************************");
        System.out.println("1.  СПИСОК КОНТАКТОВ");
        System.out.println("2.  ПОИСК КОНТАКТА");
        System.out.println("3.  СОЗДАТЬ КОНТАКТ");
        System.out.println("4.  РЕДАКТИРОВАТЬ КОНТАКТ");
        System.out.println("5.  УДАЛИТЬ КОНТАКТ");
        System.out.println("6.  СПИСОК ГРУПП");
        System.out.println("7.  ПОИСК ГРУППЫ");
        System.out.println("8.  СОЗДАТЬ ГРУППУ");
        System.out.println("9.  РЕДАКТИРОВАНИЕ ГРУППЫ");
        System.out.println("10.  УДАЛИТЬ ГРУППУ");
        System.out.println("11.  УДАЛИТЬ ВСЕ ГРУППЫ");
        System.out.println("12. УДАЛИТЬ ВСЕ КОНТАКТЫ ");
        System.out.println();
        System.out.println("0. ВЫХОД ИЗ ПРОГРАММЫ");
        System.out.println("***************************************************");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String message = "default";

        while (true) {
            try {
                System.out.print("Нажмите пункт меню, нажав соответсвующую цифру: ");
                String num = reader.readLine();

                switch (num){
                    case("1"):
                        System.out.println("///////////////    СПИСОК КОНТАКТОВ    ///////////////");
                        message =  contactController.findAll();
                        break;
                    case ("2"):
                        System.out.println("///////////////    МЕНЮ ПОИСКА КОНТАКТА    ///////////////");
                        System.out.print("Введите id: ");
                        try {
                            message = contactController.findById(Long.valueOf(reader.readLine()));
                        } catch (IOException e) {
                            throw new ClientException("Ошибка при вводе", e);
                        }
                        break;
                    case ("3"):
                        System.out.println("///////////////    МЕНЮ СОЗДАНИЯ КОНТАКТА    ///////////////");
                        System.out.print("Введите id: ");
                        try {
                            Contact contact = new Contact();
                            contact.setId(Long.valueOf(reader.readLine()));
                            message = contactController.add(contact);
                        } catch (IOException e) {
                            throw new ClientException("Ошибка при вводе", e);
                        }
                        break;
                    case ("4"):
                        System.out.println("///////////////    МЕНЮ РЕДАКТИРОВАНИЕ КОНТАКТА    ///////////////");


                        System.out.print("Введите id: ");
                        try {
                            Contact contact = new Contact();
                            contact.setId(Long.valueOf(reader.readLine()));
                            message = contactController.update(contact);
                        } catch (IOException e) {
                            throw new ClientException("Ошибка при вводе", e);
                        }
                        break;
                    case ("5"):
                        System.out.println("///////////////    МЕНЮ УДАЛЕНИЯ КОНТАКТА    ///////////////");
                        message = contactController.delete(Long.valueOf(num));
                        break;
                    case ("6"):
                        System.out.println("///////////////    СПИСОК ГРУПП КОНТАКТОВ    ///////////////");
    //                    cvc.viewReadGroup();
                        break;
                    case ("7"):
                        System.out.println("///////////////    МЕНЮ ПОИСКА ГРУПП    ///////////////");
    //                    cvc.viewSearchGroup();
                        break;
                    case ("8"):
                        System.out.println("///////////////    МЕНЮ СОЗДАНИЯ ГРУППЫ    ///////////////");
    //                    cvc.viewCreateGroup();
                        break;
                    case ("9"):
                        System.out.println("///////////////    МЕНЮ РЕДАКТИРОВАНИЯ ГРУППЫ    ///////////////");
    //                    cvc.viewUpdateGroup();
                        break;
                    case ("10"):
                        System.out.println("///////////////    МЕНЮ УДАЛЕНИЯ ГРУППЫ    ///////////////");
    //                    cvc.viewDeleteGroup();
                        break;
                    case ("11"):
                        System.out.println("///////////////    МЕНЮ УДАЛЕНИЯ ВСЕХ ГРУПП    ///////////////");
    //                    cvc.viewDeleteAllGroup();
                        break;
                    case ("12"):
                        System.out.println("///////////////    МЕНЮ УДАЛЕНИЯ ВСЕХ КОНТАКТОВ    ///////////////");
    //                    cvc.viewDeleteAllContact();
                        break;
                    case ("0"):
                        System.out.println("///////////////    ВЫХОД ИЗ ПРОГРАММЫ    ///////////////");
    //                                    serialization.viewSerialization();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Ошибка. Повторите ввод. Введите цифру с 0 до 12, соответсвующую пункту меню");
    //                    viewMainMenu();
                        break;
                }
    //            viewMainMenu();

    //            } catch (NullPointerException e){
    //                    System.out.println("Первое сохранение. Создаем файлы");
            } catch (IOException e){
                throw new ClientException("Ошибка ввода метод viewMainMenu" , e);
            }
            System.out.println(message);
        }


    }
    }



