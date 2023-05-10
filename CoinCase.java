package kita7;

public class CoinCase {
//フィールド
	private int FiveHundred=0;
	private int OneHundred=0;
	private int Fifty=0;
	private int Ten=0;
	private int Five=0;
	private int One=0;
	
//コンストラクタ
	

//メソッド
	public void AddCoin(int coin ,int num) {
		if(coin==500) {
			FiveHundred+=num;
		}else if (coin==100) {
			OneHundred+=num;
		}else if (coin==50) {
			Fifty+=num;
		}else if (coin==10) {
			Ten+=num;
		}else if (coin==5) {
			Five+=num;
		}else if (coin==1) {
			One+=num;
		}	
	}
	
	public int getCount() {
		return FiveHundred+OneHundred+Fifty+Ten+Five+One;
	}
	
	public int GetCount(int coin) {
		if(coin==500) {
			return FiveHundred;
		}else if (coin==100) {
			return OneHundred;
		}else if (coin==50) {
			return Fifty;
		}else if (coin==10) {
			return Ten;
		}else if (coin==5) {
			return Five;
		}else if (coin==1) {
			return One;
		}else {
			return 0;
		}
	}
	
	public int GetAmount() {
		return FiveHundred*500+OneHundred*100+Fifty*50+Ten*10+Five*5+One;
	}
	
	public int GetAmount(int coin) {
		if(coin==500) {
			return FiveHundred*500;
		}else if (coin==100) {
			return OneHundred*100;
		}else if (coin==50) {
			return Fifty*50;
		}else if (coin==10) {
			return Ten*10;
		}else if (coin==5) {
			return Five*5;
		}else if (coin==1) {
			return One;
		}else {
			return 0;
		}
	}
}
