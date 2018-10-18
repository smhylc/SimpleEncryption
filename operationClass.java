package sifreleme;

public class operationClass 
{
	String turkish_alphabet = "abcçdefgğhii̇jklmnoöprsştuüvyz";
	
	
	public String textAtbash = "";		
	public Integer shiftNumber;
	public int i;
	public String cipher;
	public int length;
	public String encrypted = "";
	public String encryptedAtbash = "";
	// space because first run program , resultText "null XxXx " bug. So not bug for first value ""
	
	char[] eng_alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	char[] reverseAlphabet = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};

	
	
	public void Ceaser(String text , int shift) 
	{
		
		this.shiftNumber = shift;
		
		for(i=shift;i<29+shift;i++) {
			cipher += turkish_alphabet.charAt(i%29);
		}
		
		this.length = text.length();
		
		for(int i = 0;i<length;i++) {
			
			for(int j=0;j<29;j++) {
				
				if(text.charAt(i)==turkish_alphabet.charAt(j)) {
					
					this.encrypted += turkish_alphabet.charAt((j+shiftNumber)%29);

				}
			}
		}

		
	}
	
	public void Atbash(String text) 
	{

		char[] userChar = text.toCharArray();
		
		for(int i = 0 ; i<userChar.length ; i++) {
			
			
			for(int j = 0 ; j<26 ; j++) {
				
				if(userChar[i] == eng_alphabet[j]) {
					
					this.encryptedAtbash += reverseAlphabet[j];
					
				}
				
			}
			
			
		}
		
		
	}
	


}
