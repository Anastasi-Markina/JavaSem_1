//  Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}



// public class Main
// {
// 	public static void main(String[] args) throws IOException{
 public class Sem2One {
	                  
		StringBuilder wherePart = new StringBuilder();
		for(String param : params){
		    if(param.endsWith("\"null\""))
		        continue;
		    wherePart.append(param.replaceFirst("\"", "")
 .replaceFirst("\"","")+",");
		}
		String result = wherePart.substring(0, wherePart.length() - 1);
		System.out.println("task1 result:\n" + result);
		
    }