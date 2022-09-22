// Task 6 


int [][] board = new int [8][8]; 



void setup()
{
 size(700,700); 
 
  for(int row =0; row < 8; row++)
  {
      for(int column=0; column <8; column++)
      {
        //her finder vi ud af om row/column er lige tal(felter)
        if((row + column) % 2 ==0) 
        {
          //vi definerer her at det er sorte felter
          board[row][column] = 0;
          
        }
        //else = ulige tal (felter)
        else
        {
          //vi definerer her at det er hvide felter
          board[row][column] = 1; 
        }
        
      } 
      
  }  
  
}  



void draw()
{
  creatingBoard();
  
} 



void creatingBoard()
{
  int sideLength = 40; 
  
  
    for(int row =0; row < 8; row++)
  {
      for(int column=0; column <8; column++)
      {
        if(board[row][column] == 0)
        {
          fill(0);
        }  
        else
        {
          fill(255);
        }  
        rect(row * sideLength, column * sideLength, sideLength, sideLength);   
        
      } 
      
  }  
  
}  
