public class Card
	{
		// private variables
		private String rank;
		private String suit;
		private int value;
		
		// Array List Definer
		public Card(String r, String s, int v)
			{
				rank = r;
				suit = s;
				value = v;
			}
		
		// Getters and Setters 
		public String getRank()
			{
				return rank;
			}

		public void setRank(String rank)
			{
				this.rank = rank;
			}

		public String getSuit()
			{
				return suit;
			}

		public void setSuit(String suit)
			{
				this.suit = suit;
			}

		public int getValue()
			{
				return value;
			}

		public void setValue(int value)
			{
				this.value = value;
			}
	}
