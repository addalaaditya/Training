package day2;

public class sc2 {

	    public static void main(String[] args) {
	        String str = "  Hello, World!  ";
	        String str2 = "hello, world!";
	        String str3 = "JAVA Programming";
	        String empty = "";
	        String spaced = "   ";
	        String multiLine = "Line1\nLine2";

	        System.out.println(" Length: " + str.length());
	        System.out.println(" CharAt: " + str.charAt(1));
	        System.out.println(" Substring: " + str.substring(2, 7));
	        System.out.println(" Equals: " + str.equals(str2));
	        System.out.println(" EqualsIgnoreCase: " + str.trim().equalsIgnoreCase(str2));
	        System.out.println(" ToUpperCase: " + str.toUpperCase());
	        System.out.println(" ToLowerCase: " + str.toLowerCase());
	        System.out.println(" Trim: '" + str.trim() + "'");
	        System.out.println(" Contains: " + str.contains("World"));
	        System.out.println(" IndexOf: " + str.indexOf('o'));
	        System.out.println(" LastIndexOf: " + str.lastIndexOf('o'));
	        System.out.println(" IsEmpty: " + empty.isEmpty());
	        System.out.println(" Replace: " + str.replace('o', 'x'));
	        System.out.println(" ReplaceAll: " + str.replaceAll("l", "L"));
	        System.out.println(" ReplaceFirst: " + str.replaceFirst("l", "X"));
	        System.out.println(" StartsWith: " + str.startsWith("  He"));
	        System.out.println(" EndsWith: " + str.endsWith("!  "));
	        System.out.println(" CompareTo: " + str.compareTo(str2));
	        System.out.println(" CompareToIgnoreCase: " + str.compareToIgnoreCase(str2));
	        System.out.println(" Matches: " + str.matches(".*World.*"));	       
	        System.out.println(" Join: " + String.join(" - ", "One", "Two", "Three"));
	        System.out.println(" SubSequence: " + str.subSequence(2, 7));
	        System.out.println(" Concat: " + str.concat(" Welcome!"));
	        System.out.println(" CodePointAt: " + str.codePointAt(1));
	        System.out.println(" CodePointBefore: " + str.codePointBefore(1));
	        System.out.println(" CodePointCount: " + str.codePointCount(0, 5));
	        System.out.println(" IndexOf from index: " + str.indexOf('l', 4));
	        System.out.println(" LastIndexOf from index: " + str.lastIndexOf('l', 10));
	        System.out.println(" Contains: " + str.contains("lo, W"));
	        System.out.println(" ToString: " + str.toString());
	        System.out.println(" CompareToIgnoreCase: " + "abc".compareToIgnoreCase("ABC"));
	        System.out.println(" Substring from index: " + str.substring(5));
	    }
	

}
