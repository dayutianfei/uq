package cn.dayutianfei.uq.poker.prototype;

public class CardInfo {

	public static final int CARD_NUMBER = 54; // with 2 JOKERs

	public enum Color {
		SPADE, // 黑桃(0)
		HEART, // 红心(1)
		CLUB, // 梅花(2)
		DIAMOND // 方块(3)
	}

	public enum CardSeq {
		C_A("A", 0), C_2("2", 1), C_3("3", 2), C_4("4", 3), C_5("5", 4), C_6(
				"6", 5), C_7("7", 6), C_8("8", 7), C_9("9", 8), C_10("10", 9), C_J(
				"J", 10), C_Q("Q", 11), C_K("K", 12);
		private String name;
		private int index;
		private CardSeq(String name, int index) {
			this.name = name;
			this.index = index;
		}
		public static String getName(int index) {
			for (CardSeq c : CardSeq.values()) {
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

	public static void main(String[] args) {
		System.out.println(CardSeq.values().length);
		System.out.println(Color.HEART.ordinal());
	}
}
