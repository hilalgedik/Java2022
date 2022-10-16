package overriding;

public class BaseKrediManager {
	
	public final double hesapla(double tutar) {
		
		return tutar*1.18;
		
	}

	//javada bütün metodlar overridable oluşur, eğer override edilmesini istemiyorsak final keywordunu eklememiz gerekir.
	
}
