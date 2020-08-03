package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		for(int i=s.length(); i>0; i--) {
			s+=i;
		}
		return s;
	}

}
