package kita7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CoinCaseTest {
	
	CoinCase cc;
	
	@BeforeEach
	//前処理　BeforeEachだと1回1回テストが実行される前に処理を行う。
	public void setUp() {
		//インスタンス化
		cc=new CoinCase();
	}

	@Test
	@DisplayName("コインの総額の集計プログラムとコイン追加のプログラム")
	void test() {
		cc.AddCoin(10, 2);
		
		assertEquals(20,cc.GetAmount());
	}
	
	@Test
	@DisplayName("コインの枚数とコイン追加のプログラム")
	void test2() {
		cc.AddCoin(500, 4);
		cc.AddCoin(100, 3);
		cc.AddCoin(50, 7);
		cc.AddCoin(10, 9);
		cc.AddCoin(5, 6);
		cc.AddCoin(1, 3);
		cc.AddCoin(124, 43);
		cc.AddCoin(500, 2);
		cc.AddCoin(5, 3);
		cc.AddCoin(8, 2);
		
		assertEquals(6,cc.GetCount(500));
		assertEquals(3,cc.GetCount(100));
		assertEquals(7,cc.GetCount(50));
		assertEquals(9,cc.GetCount(10));
		assertEquals(9,cc.GetCount(5));
		assertEquals(3,cc.GetCount(1));
		
		int allCount=cc.GetCount(500)+cc.GetCount(100)+cc.GetCount(50)+cc.GetCount(10)+cc.GetCount(5)+cc.GetCount(1);
		
		assertEquals(allCount,cc.getCount());
		
		}
		
		@Test
		@DisplayName("コインの総額と、コインの追加のプログラム")
		public void test3() {
			cc.AddCoin(500, 4);
			cc.AddCoin(100, 3);
			cc.AddCoin(50, 7);
			cc.AddCoin(10, 9);
			cc.AddCoin(5, 6);
			cc.AddCoin(1, 3);
			cc.AddCoin(124, 43);
			cc.AddCoin(8, 2);
			
			assertEquals(2000,cc.GetAmount(500));
			assertEquals(300,cc.GetAmount(100));
			assertEquals(350,cc.GetAmount(50));
			assertEquals(90,cc.GetAmount(10));
			assertEquals(30,cc.GetAmount(5));
			assertEquals(3,cc.GetAmount(1));
			
			int allMoney=cc.GetAmount(500)+cc.GetAmount(100)+cc.GetAmount(50)+cc.GetAmount(10)+cc.GetAmount(5)+cc.GetAmount(1);
			
			assertEquals(allMoney,cc.GetAmount());
			
		}
		

}
