package FindGene;

public class Part3 {

	public boolean twoOccurrences(String stringa,String stringb)
	{
		int ind = stringb.indexOf(stringa);
		if(ind!=-1)
			if(stringb.indexOf(stringa,ind)!=-1)
				return true;
		return false;
	}
	public void testing()
	{
		boolean flag;
		String string1,string2;
		string2 = "abcdefgabcdefg";
		string1 = "bcd";
		flag =  twoOccurrences(string1,string2);
		System.out.println(string1);
		System.out.println(string2);
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
		string2 = "abcdefgabcdefg";
		string1 = "bcdk";
		flag =  twoOccurrences(string1,string2);
		System.out.println(string1);
		System.out.println(string2);
		if(flag)
			System.out.println("true");
		else
			System.out.println("false");
		String string = lastPart(string1,string2);
		System.out.println("The part of the string after "+ string1 + " in " + string2 + " is " + string);
		string1 = "bcd";
		string = lastPart(string1,string2);
		System.out.println("The part of the string after "+ string1 + " in " + string2 + " is " + string);
	}
	public String lastPart(String stringa,String stringb)
	{
		int indx = stringb.indexOf(stringa);
		if(indx!=-1)
			return stringb.substring(indx+stringa.length(),stringb.length());
		return stringb;
	}
	
	
	public static void main(String[] args) {
		Part3 object = new Part3();
		object.testing();

}
	
	
}
