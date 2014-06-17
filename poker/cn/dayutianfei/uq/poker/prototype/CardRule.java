package cn.dayutianfei.uq.poker.prototype;


public class CardRule {
	public enum DouDiZhu{
		KingBomb("王炸",0),Bomb("炸弹",1);
		private String name;
		private int index;
		private DouDiZhu(String name, int index) {
			this.name = name;
			this.index = index;
		}
		public static String getName(int index) {
			for (DouDiZhu c : DouDiZhu.values()) {
				if (c.getIndex() == index) {
					return c.name;
				}
			}
			return null;
		}
		public String getName() {
			return name;
		}
		public int getIndex() {
			return index;
		}
	}
	public enum BasicRule{
		RoyalFlush, // royal flush  同花大顺
		StraightFlush, // straight flush  同花顺
		Straight, // straight  顺子
		FoutOfAKindWithOnePair,
		FoutOfAKindWithTwoSingleCard,
		FourOfAKind, // four of a kind  四张相同的牌
		StraightThreeOfAKindWithPairs,
		StraightThreeOfAKindWithSingleCard,
		StraightThreeOfAKind,
		FullHouse, // full house  三张相同和二张相同的牌
		ThreeOfAKindWithOneSingleCard,
		ThreeOfAKind, // three of a kind  三张相同的牌
		StraightPairs, 
		TwoPairs, //two pairs  双对子
		OnePair, // one pair  一对,对子
		SingleCard // 单张牌
	}
}
