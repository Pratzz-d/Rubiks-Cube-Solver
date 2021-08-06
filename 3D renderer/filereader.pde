public String setseq()
{
  String[] line = loadStrings("C:\\Users\\prath\\Desktop\\Final PBL\\moves.txt");
  String x = new String("");
  for(int i=0;i<line[0].length();i++)
  {
      if(line[0].charAt(i) == '2')
      {
          x = x + line[0].charAt(i-1);
      }
      else
      {
         x = x + line[0].charAt(i);
      }
  }
  x = x.replaceAll("U'", "u");
  x = x.replaceAll("L'", "l");
  x = x.replaceAll("R'", "r");
  x = x.replaceAll("D'", "d");
  x = x.replaceAll("B'", "b");
  x = x.replaceAll("F'", "f");
  x = x.replaceAll("x'", "r M L");
  x = x.replaceAll("x", "R m l");
  x = x.replaceAll("y'", "u E D");
  x = x.replaceAll("y", "U e d");
  x = x.replaceAll("z'", "f s B");
  x = x.replaceAll("z", "F S b");
  //System.out.println(x.length());
  return(x);
}

public int getint(char ch)
{
  switch(ch)
  {
    case 'D' : return(0);
    case 'd' : return(1);
    case 'u' : return(2);
    case 'U' : return(3);
    case 'r' : return(4);
    case 'R' : return(5);
    case 'l' : return(6);
    case 'L' : return(7);
    case 'f' : return(8);
    case 'F' : return(9);
    case 'b' : return(10);
    case 'B' : return(11);
    case 'M' : return(12);
    case 'm' : return(13);
    case 'E' : return(14);
    case 'e' : return(15);
    case 'S' : return(16);
    case 's' : return(17);
    default : return(-1);
  }
}
