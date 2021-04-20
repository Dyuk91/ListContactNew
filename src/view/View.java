package view;

import service.clientException.ClientException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {

//        ControllerView cvc = new ControllerView();

//    public void viewMainMenu (){
//
//            System.out.println("***************************************************");
//            System.out.println("///////////////    ГЛАВНОЕ МЕНЮ    ///////////////");
//            System.out.println("***************************************************");
//            System.out.println("1.  СПИСОК КОНТАКТОВ");
//            System.out.println("2.  ПОИСК КОНТАКТА");
//            System.out.println("3.  СОЗДАТЬ КОНТАКТ");
//            System.out.println("4.  РЕДАКТИРОВАТЬ КОНТАКТ");
//            System.out.println("5.  УДАЛИТЬ КОНТАКТ");
//            System.out.println("6.  СПИСОК ГРУПП");
//            System.out.println("7.  ПОИСК ГРУППЫ");
//            System.out.println("8.  СОЗДАТЬ ГРУППУ");
//            System.out.println("9.  РЕДАКТИРОВАНИЕ ГРУППЫ");
//            System.out.println("10.  УДАЛИТЬ ГРУППУ");
//            System.out.println("11.  УДАЛИТЬ ВСЕ ГРУППЫ");
//            System.out.println("12. УДАЛИТЬ ВСЕ КОНТАКТЫ ");
//            System.out.println();
//            System.out.println("0. ВЫХОД ИЗ ПРОГРАММЫ");
//            System.out.println("***************************************************");
//
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//            try {
//                    System.out.print("Нажмите пункт меню, нажав соответсвующую цифру: ");
//                    String num = reader.readLine();
//
//                    switch (num){
//                            case("1"):
//                                    System.out.println("///////////////    СПИСОК КОНТАКТОВ    ///////////////");
//                                        cvc.viewReadContact();
//                                        break;
//                            case ("2"):
//                                    System.out.println("///////////////    МЕНЮ ПОИСКА КОНТАКТА    ///////////////");
//                                    cvc.viewSearchContact();
//                                    break;
//                            case ("3"):
//                                    System.out.println("///////////////    МЕНЮ СОЗДАНИЯ КОНТАКТА    ///////////////");
//                                    cvc.viewCreateContact();
//                                    break;
//                            case ("4"):
//                                    System.out.println("///////////////    МЕНЮ РЕДАКТИРОВАНИЕ КОНТАКТА    ///////////////");
//                                    cvc.viewUpdateContact();
//                                    break;
//                            case ("5"):
//                                    System.out.println("///////////////    МЕНЮ УДАЛЕНИЯ КОНТАКТА    ///////////////");
//                                    cvc.viewDeleteContact();
//                                    break;
//                            case ("6"):
//                                    System.out.println("///////////////    СПИСОК ГРУПП КОНТАКТОВ    ///////////////");
//                                    cvc.viewReadGroup();
//                                    break;
//                            case ("7"):
//                                    System.out.println("///////////////    МЕНЮ ПОИСКА ГРУПП    ///////////////");
//                                    cvc.viewSearchGroup();
//                                    break;
//                            case ("8"):
//                                    System.out.println("///////////////    МЕНЮ СОЗДАНИЯ ГРУППЫ    ///////////////");
//                                    cvc.viewCreateGroup();
//                                    break;
//                            case ("9"):
//                                    System.out.println("///////////////    МЕНЮ РЕДАКТИРОВАНИЯ ГРУППЫ    ///////////////");
//                                    cvc.viewUpdateGroup();
//                                    break;
//                            case ("10"):
//                                    System.out.println("///////////////    МЕНЮ УДАЛЕНИЯ ГРУППЫ    ///////////////");
//                                    cvc.viewDeleteGroup();
//                                    break;
//                            case ("11"):
//                                    System.out.println("///////////////    МЕНЮ УДАЛЕНИЯ ВСЕХ ГРУПП    ///////////////");
//                                    cvc.viewDeleteAllGroup();
//                                    break;
//                            case ("12"):
//                                    System.out.println("///////////////    МЕНЮ УДАЛЕНИЯ ВСЕХ КОНТАКТОВ    ///////////////");
//                                    cvc.viewDeleteAllContact();
//                                    break;
//                            case ("0"):
//                                    System.out.println("///////////////    ВЫХОД ИЗ ПРОГРАММЫ    ///////////////");
////                                    serialization.viewSerialization();
//                                    System.exit(0);
//                                    break;
//
//                            default:
//                                    System.out.println("Ошибка. Повторите ввод. Введите цифру с 0 до 12, соответсвующую пункту меню");
//                                    viewMainMenu();
//                                    break;
//                    }
//                    viewMainMenu();
//
////            } catch (NullPointerException e){
////                    System.out.println("Первое сохранение. Создаем файлы");
//            } catch (IOException e){
//                    throw new ClientException("Ошибка ввода метод viewMainMenu" , e);
//            }
//    }
}
