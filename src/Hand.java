//Hand class for players in the card game
public class Hand
{
   public final int MAX_CARDS = 52;
   private int numCards;
   private Card[] myCards;

   Hand()
   { 
      numCards = 0;
      myCards = new Card[MAX_CARDS];
      
      for(int k = 0; k < MAX_CARDS; k++)
      {
         myCards[k] = new Card();
         
      }
   }
   
    
   public int getNum()
   {
      return numCards;
   }
  
   
   Card inspectCard(int k)
   {
      if(k >= 0 && k < getNum())
      {
         char nVal = myCards[k].getValue();
         int suit = myCards[k].getSuit();
         Card temp = new Card(nVal, suit);
         return temp;
      }
      else
         return new Card('S', 2);
     
     
   }
    
   void resetHand()
   {
     numCards = 0;
   }
   
   
  boolean takeCard(Card newCard)
  {
      char nVal = newCard.getValue();
      int suit = newCard.getSuit();
      
      if(numCards < MAX_CARDS) 
      {
         if (myCards[numCards].set(nVal, suit))
            numCards++;
         
         return true;
      }   
 
         return false;
      
   }
   
   
   Card playCard()
   {
      if(myCards.length > 0)
      {
         Card temp = myCards[numCards-1];
         numCards --;
         System.out.println("Playing " + temp.toString());
         return temp;
      }
      return null;
   }
   
   
   public String toString()
   {
      String result = "\n This hand has: \n";
      for (int i = 0; i < numCards; i++)
      {
         result += myCards[i].toString();
      }
     return result;
   }    
   
}

