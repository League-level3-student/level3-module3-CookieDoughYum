package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String g="";
		for(int i=0; i<s.length(); i++) {
			if(i%2==0) {
				char a=Character.toLowerCase(s.charAt(i));
				g+=a;
			}
			else {
				char q=Character.toUpperCase(s.charAt(i));
				g+=q;
			}
		}
		return g;
	}

}
