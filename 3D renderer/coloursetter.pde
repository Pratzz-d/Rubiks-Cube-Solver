void stringreader()
{
  String coloredcube = new String(" ");
  String[] lines = loadStrings("C:\\Users\\prath\\Desktop\\Final PBL\\resource.txt");
  for(int i=0; i<lines.length;i++)
 {
   coloredcube = coloredcube.concat(lines[i]);
 }
 coloredcube = coloredcube.replaceAll("\\s","");
 int k = 0;
 for(int i=0;i<6;i++)
 {
   for(int j=0;j<9;j++)
   {
     cols[i][j] = coloredcube.charAt(k);
     k++;
   }
 }
}
color colconverter(char ch)
{
  switch(ch)
  {
    case 'R' : return(color(255,0,0));
    case 'G' : return(color(0,255,0));
    case 'B' : return(color(0,0,255));
    case 'Y' : return(color(255,255,0));
    case 'O' : return(color(255,155,0));
    case 'W' : return(color(255,255,255));
    default :  return(color(0,0,0));
  }
}
void setcolour()
{
    //cubie pos (-1,-1,-1)
    cube[0].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][2]));
    cube[0].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[0].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[0].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][0]));
    cube[0].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[0].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][0]));
    //cubie pos (-1,-1,0)
    cube[1].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[1].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[1].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[1].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][3]));
    cube[1].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[1].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][1]));
    //cubie pos (-1,-1,1)
    cube[2].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[2].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][0]));
    cube[2].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[2].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][6]));
    cube[2].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[2].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][2]));
    //pos(-1,0,-1)
    cube[3].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][5]));
    cube[3].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[3].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[3].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[3].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[3].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][3]));
    //pos(-1,0,0)
    cube[4].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[4].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[4].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[4].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[4].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[4].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][4]));
    //pos(-1,0,1)
    cube[5].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[5].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][3]));
    cube[5].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[5].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[5].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[5].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][5]));
    //pos(-1,1,-1)
    cube[6].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][8]));
    cube[6].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[6].faces[2] = new Face(new PVector(0, 1, 0),colconverter(cols[5][6]));
    cube[6].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[6].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[6].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][6]));
    //pos(-1,1,0)
    cube[7].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[7].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[7].faces[2] = new Face(new PVector(0, 1, 0),colconverter(cols[5][3]));
    cube[7].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[7].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[7].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][7]));
    //pos(-1,1,1)
    cube[8].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[8].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][6]));
    cube[8].faces[2] = new Face(new PVector(0, 1, 0),colconverter(cols[5][0]));
    cube[8].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[8].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[8].faces[5] = new Face(new PVector(-1, 0, 0), colconverter(cols[3][8]));
    
    //pos(0,-1,-1)
    cube[9].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][1]));
    cube[9].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[9].faces[2] = new Face(new PVector(0, 1, 0),color(0,0,0));
    cube[9].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][1]));
    cube[9].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[9].faces[5] = new Face(new PVector(-1, 0, 0),color(0,0,0));
    //pos(0,-1,0)
    cube[10].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[10].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[10].faces[2] = new Face(new PVector(0, 1, 0),color(0,0,0));
    cube[10].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][4]));
    cube[10].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[10].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    //pos(0,-1,1)
    cube[11].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[11].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][1]));
    cube[11].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[11].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][7]));
    cube[11].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[11].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    
    //pos(0,0,-1)
    cube[12].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][4]));
    cube[12].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[12].faces[2] = new Face(new PVector(0, 1, 0),color(0,0,0));
    cube[12].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[12].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[12].faces[5] = new Face(new PVector(-1, 0, 0),color(0,0,0));
    //pos(0,0,1)
    cube[14].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[14].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][4]));
    cube[14].faces[2] = new Face(new PVector(0, 1, 0),color(0,0,0));
    cube[14].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[14].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[14].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    
    //pos(0,1,-1)
    cube[15].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][7]));
    cube[15].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[15].faces[2] = new Face(new PVector(0, 1, 0),colconverter(cols[5][7]));
    cube[15].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[15].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[15].faces[5] = new Face(new PVector(-1, 0, 0),color(0,0,0));
    //pos(0,1,0)
    cube[16].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[16].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[16].faces[2] = new Face(new PVector(0, 1, 0),colconverter(cols[5][4]));
    cube[16].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[16].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[16].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    //pos(0,1,1)
    cube[17].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[17].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][7]));
    cube[17].faces[2] = new Face(new PVector(0, 1, 0),colconverter(cols[5][1]));
    cube[17].faces[3] = new Face(new PVector(0, -1, 0),color(0, 0, 0));
    cube[17].faces[4] = new Face(new PVector(1, 0, 0), color(0, 0, 0));
    cube[17].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    
    //pos(1,-1,-1)
    cube[18].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][0]));
    cube[18].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[18].faces[2] = new Face(new PVector(0, 1, 0),color(0,0,0));
    cube[18].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][2]));
    cube[18].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][2]));
    cube[18].faces[5] = new Face(new PVector(-1, 0, 0),color(0,0,0));
    //pos(1,-1,0)
    cube[19].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[19].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[19].faces[2] = new Face(new PVector(0, 1, 0),color(0,0,0));
    cube[19].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][5]));
    cube[19].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][1]));
    cube[19].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    //pos(1,-1,1)
    cube[20].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[20].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][2]));
    cube[20].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[20].faces[3] = new Face(new PVector(0, -1, 0),colconverter(cols[4][8]));
    cube[20].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][0]));
    cube[20].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    
    //pos(1,0,-1)
    cube[21].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][3]));
    cube[21].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[21].faces[2] = new Face(new PVector(0, 1, 0),color(0,0,0));
    cube[21].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[21].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][5]));
    cube[21].faces[5] = new Face(new PVector(-1, 0, 0),color(0,0,0));
    //pos(1,0,0)
    cube[22].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[22].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[22].faces[2] = new Face(new PVector(0, 1, 0),color(0,0,0));
    cube[22].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[22].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][4]));
    cube[22].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    //pos(1,0,1)
    cube[23].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[23].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][5]));
    cube[23].faces[2] = new Face(new PVector(0, 1, 0),color(0, 0, 0));
    cube[23].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[23].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][3]));
    cube[23].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    
    //pos(1,1,-1)
    cube[24].faces[0] = new Face(new PVector(0, 0, -1), colconverter(cols[2][6]));
    cube[24].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[24].faces[2] = new Face(new PVector(0, 1, 0), colconverter(cols[5][8]));
    cube[24].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[24].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][8]));
    cube[24].faces[5] = new Face(new PVector(-1, 0, 0),color(0,0,0));
    //pos(1,1,0)
    cube[25].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[25].faces[1] = new Face(new PVector(0, 0,  1), color(0, 0, 0));
    cube[25].faces[2] = new Face(new PVector(0, 1, 0),colconverter(cols[5][5]));
    cube[25].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[25].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][7]));
    cube[25].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
    //pos(1,1,1)
    cube[26].faces[0] = new Face(new PVector(0, 0, -1), color(0,0,0));
    cube[26].faces[1] = new Face(new PVector(0, 0,  1), colconverter(cols[0][8]));
    cube[26].faces[2] = new Face(new PVector(0, 1, 0),colconverter(cols[5][2]));
    cube[26].faces[3] = new Face(new PVector(0, -1, 0),color(0,0,0));
    cube[26].faces[4] = new Face(new PVector(1, 0, 0), colconverter(cols[1][6]));
    cube[26].faces[5] = new Face(new PVector(-1, 0, 0), color(0,0,0));
}
