// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре
//  будут повторяющиеся имена с разными телефонами, их необходимо
//  считать, как одного человека с разными телефонами. 
// Вывод должен быть отсортирован по убыванию числа телефонов.
import java.util.*;

public class Sem5One {

    private Map<String, ArrayList<String>> book;

    public Sem5One(){
        this.book = new HashMap<>();
    }

    private String printContactsByName(String name){
        if(!book.containsKey(name)){
            return "Error: no such a name in contacts: " + name;
        }
        StringBuilder result = new StringBuilder(name + ": ");
        Iterator<String> numbers = book.get(name).iterator();
        if(!numbers.hasNext()){
            result.append("empty contact");
            return result.toString();
        }
        String number = numbers.next();
        while(numbers.hasNext()){
            result.append(number + ", ");
            number = numbers.next();
        }
        result.append(number);
        return result.toString();
    } 

    public void addPhoneNumber(String name, String number){
        if(!book.containsKey(name)){
            ArrayList<String> numbers = new ArrayList<>();
            book.put(name, numbers);
        }
        book.get(name).add(number);
    }

    public void printAllContacts(){
        List<String> names = new ArrayList<>(book.keySet());
        names.sort((name1, name2) -> book.get(name2).size() - book.get(name1).size());
        for(String name : names){
            System.out.println(printContactsByName(name));
        }
    }
}
