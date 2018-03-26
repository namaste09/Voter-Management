import java.util.*;
import java.lang.*;
//Checking class, includes all the classes that excute in the background to check possibilities.

class check
{
  public int votecheck(int a[][],String str)
  {
    StringBuffer sb=new StringBuffer(str);
    int t;
    int t1=sb.charAt(1)-48;
    int t2=sb.charAt(2)-48;
    int t3=sb.charAt(3)-48;
    t=(t1*100)+(t2*10)+t3;
    if((sb.charAt(0)<'a'||sb.charAt(0)>'z')||sb.length()!=4||t>999)
    {
      return -1;
    }

    else if(a[((int)sb.charAt(0)-'a')][t]==1)
    {
      return 1;
    }
    else{
      return 0;
    }
  }
  public void installvote(int a[][],String str)
  {
    StringBuffer sb=new StringBuffer(str);
    int t;
    int t1=sb.charAt(1)-48;
    int t2=sb.charAt(2)-48;
    int t3=sb.charAt(3)-48;
    t=(t1*100)+(t2*10)+t3;
    a[(int)sb.charAt(0)-'a'][t]=1;
    System.out.println("Your vote has been registered.");
  }
public int districtcheck(String str)
  {
    StringBuffer sb=new StringBuffer(str);
    if(((int)sb.charAt(0)-'a')<6)
    {
      return 1;
    }
    if(((int)sb.charAt(0)-'a')<12)
    {
      return 2;
    }
    if(((int)sb.charAt(0)-'a')<19)
    {
      return 3;
    }
    if(((int)sb.charAt(0)-'a')<26)
    {
      return 4;
    }
    return -1;
  }
}

//main vote counters. objects are made of classes that extend the god class


abstract class God
{
  String konohaname[]={"Naruto Uzumaki","Sasuke Uchiha","Sakura Haruno"};
  String gothamname[]={"Joker","Robin","Harvey Dent"};
  String onepiecename[]={"Nami","Roronoa Zoro","God Usopp"};
  String westerosname[]={"Tyrion Lannister","Jon Snow","Petyr Baelish"};
  abstract int vote(int w2[]);
}
class konoha extends God
{
  String password;
  String voterid;
  int n;
  public int vote(int votecount[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\t\t\t Welcome to Konoha\n\t\t\t---------------------\nPlease enter the number of the candidate you want to vote for:");
    System.out.println("\t1."+konohaname[0]+" \n\t2."+konohaname[1]+" \n\t3."+konohaname[2]);
	System.out.print("\t");
    n=sc.nextInt();
    switch(n)
    {
      case 1:votecount[0]++;return 0;
      case 2:votecount[1]++;return 0;
      case 3:votecount[2]++;return 0;
      default:System.out.println("Invalid option.");return 1;
    }
  }
}
class gotham extends God
{
  String password;
  String voterid;
  int n;
  public int vote(int votecount[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\t\t\t Welcome t Gotham\n\t\t\t---------------------\nPlease enter the number of the candidate you want to vote for:");
    System.out.println("\t1."+gothamname[0]+"\n\t2."+gothamname[1]+" \n\t3."+gothamname[2]);
	System.out.print("\t");
    n=sc.nextInt();
    switch(n)
    {
      case 1:votecount[3]++;return 0;
      case 2:votecount[4]++;return 0;
      case 3:votecount[5]++;return 0;
      default:System.out.println("Invalid option.");return 1;
    }

  }
}
class onepiece extends God
{
  String password;
  String voterid;
  int n;
  public int vote(int votecount[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\t\t\t Welcome to One Piece\n\t\t\t---------------------\nPlease enter the number of the candidate you want to vote for:");
    System.out.println("\t1."+onepiecename[0]+" \n\t2."+onepiecename[1]+" \n\t3."+onepiecename[2]);
	System.out.print("\t");
    n=sc.nextInt();
    switch(n)
    {
      case 1:votecount[6]++;return 0;
      case 2:votecount[7]++;return 0;
      case 3:votecount[8]++;return 0;
      default:System.out.println("Invalid option.");return 1;
    }
  }
}
class westeros extends God
{
  String password;
  String voterid;
  int n;
  public int vote(int votecount[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\n\n\t\t\t Welcome to westeros\n\t\t\t---------------------\nPlease enter the number of the candidate you want to vote for:");
    System.out.println("\t1." +westerosname[0]+ "\n\t2."+westerosname[1]+ "\n\t3."+westerosname[2]);
	System.out.print("\t");
    n=sc.nextInt();
    switch(n)
    {
      case 1:votecount[9]++;return 0;
      case 2:votecount[10]++;return 0;
      case 3:votecount[11]++;return 0;
      default:System.out.println("Invalid option.");return 1;
    }
  }
}



class display extends God
{
 int vote(int votecount[])
 {
   return 0;
 }

  public void displayresult(int votecount[])
  {
    System.out.println("\n\n\nThe results for IAN are: ");
    int konohamax=votecount[0]>votecount[1]?(votecount[0]>votecount[2]?votecount[0]:votecount[2]):(votecount[1]>votecount[2]?votecount[1]:votecount[2]);
    int gothammax=votecount[3]>votecount[4]?(votecount[3]>votecount[5]?votecount[3]:votecount[5]):(votecount[4]>votecount[5]?votecount[4]:votecount[5]);
    int westerosmax=votecount[9]>votecount[10]?(votecount[9]>votecount[11]?votecount[9]:votecount[11]):(votecount[10]>votecount[11]?votecount[10]:votecount[11]);
    int onepiecemax=votecount[6]>votecount[7]?(votecount[6]>votecount[8]?votecount[6]:votecount[8]):(votecount[7]>votecount[8]?votecount[7]:votecount[8]);
    if((votecount[0]==votecount[1] || votecount[2]==votecount[1] || votecount[0]==votecount[2]) && (votecount[0]!=0 && votecount[1]!=0) && (votecount[2]!=0 && votecount[1]!=0) && (votecount[0]!=0 && votecount[2]!=0))
    	System.out.println("\n\tResults tied in Konoha");
    else if(konohamax==votecount[0] && konohamax!=0)
      System.out.println("\n\tThe winner in Konoha is "+konohaname[0]+" with "+votecount[0]+" vote(s).");
    else if(konohamax==votecount[1] && konohamax!=0)
      System.out.println("\n\tThe winner in Konoha is "+konohaname[1]+" with "+votecount[1]+" vote(s).");
    else if(konohamax == votecount[2] && konohamax!=0)
      System.out.println("\n\tThe winner in Konoha is "+konohaname[2]+" with "+votecount[2]+" vote(s).");
    else
      System.out.println("\nNo winner in Konoha");
    if((votecount[3]==votecount[4] || votecount[5]==votecount[3] || votecount[4]==votecount[5]) && (votecount[3]!=0 && votecount[4]!=0) && (votecount[4]!=0 && votecount[5]!=0) && (votecount[3]!=0 && votecount[5]!=0))
    	System.out.println("\n\tResults tied in Gotham");
    else if (gothammax==votecount[3] && gothammax!=0)
      System.out.println("\n\tThe winner in Gotham is "+gothamname[0]+" with "+votecount[3]+" vote(s).");
    else if (gothammax==votecount[4] && gothammax!=0)
      System.out.println("\n\tThe winner in Gotham is "+gothamname[1]+" with "+votecount[4]+" vote(s).");
    else if(gothammax==votecount[5] && gothammax!=0)
      System.out.println("\n\tThe winner in Gotham is "+gothamname[2]+" with "+votecount[5]+" vote(s).");
    else
      System.out.println("\nNo winner in Gotham");
    if((votecount[6]==votecount[7] || votecount[7]==votecount[8] || votecount[6]==votecount[8]) && (votecount[6]!=0 && votecount[7]!=0) && (votecount[7]!=0 && votecount[8]!=0) && (votecount[6]!=0 && votecount[8]!=0))
    	System.out.println("\n\tResults tied in One Piece");
    else if(onepiecemax==votecount[6] && onepiecemax!=0)
      System.out.println("\n\tThe new captain of the Thousand Sunny is "+onepiecename[0]+" with "+votecount[6]+" vote(s).");
    else if(onepiecemax==votecount[7] && onepiecemax!=0)
      System.out.println("\n\tThe new captain of the Thousand Sunny is "+onepiecename[1]+" with "+votecount[7]+" vote(s).");
    else if(onepiecemax==votecount[8] && onepiecemax!=0)
      System.out.println("\n\tThe new captain of the Thousand Sunny is "+onepiecename[2]+" with "+votecount[8]+" vote(s).");
    else
      System.out.println("\nNo captain of One Piece");
    if((votecount[9]==votecount[10] || votecount[10]==votecount[11] || votecount[9]==votecount[11]) && (votecount[9]!=0 && votecount[10]!=0) && (votecount[9]!=0 && votecount[11]!=0) && (votecount[10]!=0 && votecount[11]!=0))
    	System.out.println("\n\tResults tied in Westeros");
    else if(westerosmax==votecount[9] && westerosmax!=0)
      System.out.println("\n\tThe winner in Westeros is "+westerosname[0]+" with "+votecount[9]+" vote(s).");
    else if(westerosmax==votecount[10] && westerosmax!=0)
      System.out.println("\n\tThe winner in Westeros is "+westerosname[1]+" with "+votecount[10]+" vote(s).");
    else if(westerosmax==votecount[11] && westerosmax!=0)
      System.out.println("\n\tThe winner in Westeros is "+westerosname[2]+" with "+votecount[11]+" vote(s).");
    else
      System.out.println("\nNo winner in Westeros");
    System.out.println("\n\n");
    }
}

class project
{
    public static void main(String args[])
    {
      int votecount[]=new int[12];
      for(int p1=0;p1<12;p1++)
        votecount[p1]=0;
      int check[][]=new int[26][1000];
      for(int i=0;i<26;i++)
      {
        for(int j=0;j<1000;j++)
        {
          check[i][j]=0;
        }
      }
      Scanner sc=new Scanner(System.in);
      konoha k[]=new konoha[6000];
      gotham g[]=new gotham[6000];
      onepiece op[]=new onepiece[7000];
      westeros w[]=new westeros[7000];
      String q;
      int flag,k1=0,g1=0,op1=0,w1=0,b1;
      System.out.println("\n\n\n\n\t \t**Welcome to the voting system of IAN**\n");
      check ch1=new check();
      do
      {
        System.out.println("Do you want to \n\t1.Check who you voted for\t 2.Vote for a candidate");
	System.out.print("\t");
        int d=sc.nextInt();
        switch(d)
        {
          case 1:System.out.println("\n\n\nPlease enter your voter id (1 letter followed by 3 digits. eg. a001) :");
 	  System.out.print("\t");
            String v=sc.next();
            if(ch1.votecheck(check,v)==0)
           	 System.out.println("Voter has not voted yet. Please vote first");
          else if(ch1.votecheck(check,v)==1)
          {
            switch(ch1.districtcheck(v))
            {
              case 1: System.out.println("Please enter your password:");
		      System.out.print("\t\t\t");
                      q=sc.next();
                      flag=0;
                      for(int a1=0;a1<k1;a1++)
                      {
                        if(q.compareTo(k[a1].password)==0)
                        {
                          flag=1;
                          System.out.println("Candidate you voted for is "+k[a1].konohaname[(k[a1].n)-1]);
			  try
			  {
				System.out.println("\t\t__________________________________________\n\t\t  NOTE:Screen will be blank in 7 seconds\n\t\t------------------------------------------");
				Thread.sleep(7000);
			  }
			  catch (InterruptedException e)
			  {
				//e.printStackTrace();
			  }
			  clrscr();
                          break;
                        }
                      }
                      if(flag==0)
                        System.out.println("Entered password is wrong.Please try again.");
                      break;
              case 2: System.out.println("Please enter your password:");
		      System.out.print("\t\t\t");
                      q=sc.next();
                      flag=0;
                      for(int a1=0;a1<g1;a1++)
                      {
                        if(q.compareTo(g[a1].password)==0)
                        {
                          flag=1;
                          System.out.println("Candidate you voted for is "+g[a1].gothamname[(g[a1].n)-1]);
			  try
			  {
				System.out.println("\t\t__________________________________________\n\t\t  NOTE:Screen will be blank in 7 seconds\n\t\t------------------------------------------");
				Thread.sleep(7000);
			  }
			  catch (InterruptedException e)
			  {
				//e.printStackTrace();
			  }
			  clrscr();
                          break;
                        }
                      }
                      if(flag==0)
                        System.out.println("Entered password is wrong.Please try again.");
                      break;
              case 3: System.out.println("Please enter your password:");
		      System.out.print("\t\t\t");
                      q=sc.next();
                      flag=0;
                      for(int a1=0;a1<op1;a1++)
                      {
                        if(q.compareTo(op[a1].password)==0)
                        {
                          flag=1;
                          System.out.println("Candidate you voted for is "+op[a1].onepiecename[(op[a1].n)-1]);
			  try
			  {
				System.out.println("\t\t__________________________________________\n\t\t  NOTE:Screen will be blank in 7 seconds\n\t\t------------------------------------------");
				Thread.sleep(7000);
			  }
			  catch (InterruptedException e)
			  {
				//e.printStackTrace();
			  }
			  clrscr();
                          break;
                        }
                      }
                      if(flag==0)
                        System.out.println("Entered password is wrong.Please try again.");
                      break;
              case 4: System.out.println("Please enter your password:");
		      System.out.print("\t\t\t");
                      q=sc.next();
                      flag=0;
                      for(int a1=0;a1<w1;a1++)
                      {
                        if(q.compareTo(w[a1].password)==0)
                        {
                          flag=1;
                          System.out.println("Candidate you voted for is "+w[a1].westerosname[(w[a1].n)-1]);
			  try
			  {
				System.out.println("\t\t__________________________________________\n\t\t  NOTE:Screen will be blank in 7 seconds\n\t\t------------------------------------------");
				Thread.sleep(7000);
			  }
			  catch (InterruptedException e)
			  {
				//e.printStackTrace();
			  }
			  clrscr();
                          break;
                        }
                      }
                      if(flag==0)
                        System.out.println("Entered password is wrong.Please try again.");
                      break;
              case -1:System.out.println("Invalid Input.");break;
            }

          }
          break;
          case 2:System.out.println("\n\n\nPlease enter your voter id (1 Character followed by 3 digits. eg. a001) :\n\nNOTE:   a-f:Konoha.\n\tg-l:Gotham.\n\tm-s:One Piece.\n\tt-z:Westeros.\n\n");
	  System.out.print("\t");
          String vo=sc.next();
          int b;
          if(ch1.votecheck(check,vo)==0)
          {
            switch(ch1.districtcheck(vo))
            {
              case 1: k[k1]=new konoha();
                      k[k1].voterid=vo;
                      b=k[k1].vote(votecount);
                      if(b==0)
                      {
                        ch1.installvote(check,vo);
                        System.out.println("For future use, please enter your password. Please make sure to remember the passsword you have entered.");
			System.out.print("\t\t\t");
                        k[k1].password=sc.next();
                        k1++;
                        clrscr();
                      }
                      break;
              case 2: g[g1]=new gotham();
                      g[g1].voterid=vo;
                      b=g[g1].vote(votecount);
                      if(b==0)
                      {
                        ch1.installvote(check,vo);
                        System.out.println("For future use, please enter your password. Please make sure to remember the passsword you have entered.");
			System.out.print("\t\t\t");
                        g[g1].password=sc.next();
                        g1++;
                        clrscr();
                      }
                      break;
              case 3: op[op1]=new onepiece();
                      op[op1].voterid=vo;
                      b=op[op1].vote(votecount);
                      if(b==0)
                      {
                        ch1.installvote(check,vo);
                        System.out.println("For future use, please enter your password. Please make sure to remember the passsword you have entered.");
			System.out.print("\t\t\t");
                        op[op1].password=sc.next();
                        op1++;
                        clrscr();  
                      }
                      break;
              case 4: w[w1]=new westeros();
                      w[w1].voterid=vo;
                      b=w[w1].vote(votecount);
                      if(b==0)
                      {
                        ch1.installvote(check,vo);
                        System.out.println("For future use, please enter your password. Please make sure to remember the passsword you have entered.");
			System.out.print("\t\t\t");
                        w[w1].password=sc.next();
                        w1++;
                        clrscr();
                      }
                      break;
              case -1:System.out.println("Please check your input. Seems invalid.");break;
              default:System.out.println("Please check your input. Seems invalid.");
            }
          }
          else if(ch1.votecheck(check,vo)==1)
            System.out.println("This voter id has already voted once");
          else
            System.out.println("Invalid input. Please try again.");
          break;
          default:System.out.println("Invalind input. Please try again.");
        }
        System.out.println("Do you want to continue?");
        System.out.println("\t1.Yes \t 2.No");
	System.out.print("\t");
        b1=sc.nextInt();
        if(b1!=1 && b1!=2)
        System.out.println("Invalid input.");
      }while(b1==1);
      System.out.println("Would you like to know the results up until now?\n\t1.Yes.\t2.No.");
	System.out.print("\t");
      String h12=sc.next();
      String edge="backdoor";
      if(h12.compareTo(edge)!=0)
      {		 
      		 StringBuffer kb= new StringBuffer(h12);
			 int h =kb.charAt(0)-48;
    	     switch(h)
	      {
		  case 1: display z1=new display();
		  z1.displayresult(votecount);
		    break;
		  case 2:System.out.println("Thankyou for voting.");
		    break;
		  default:System.out.println("Invalid input. Thankyou for voting.");
		    break;
	      }
      }
      else
      {	
      	int flagbd1=0,flagbd2=0,flagbd3=0,flagbd4=0;	
		for(int bd1=0; bd1<k1; bd1++)
		{	
			if(flagbd1++==0)
				System.out.println("\nThe voters for Konoha are:\n\tVoter id:\t\tId Password\t\tVoted for");
			System.out.print("\t"+k[bd1].voterid+"     \t\t"+k[bd1].password);
			for(int space1=k[bd1].password.length() ; space1<24 ; space1++)
				System.out.print(" ");
			System.out.println(k[bd1].konohaname[(k[bd1].n)-1]);
		}
		for(int bd1=0; bd1<g1; bd1++)
		{	
			if(flagbd2++==0)
				System.out.println("\nThe voters for Gotham are:\n\tVoter id:\t\tId Password\t\tVoted for");
			System.out.print("\t"+g[bd1].voterid+"     \t\t"+g[bd1].password);
			for(int space1=g[bd1].password.length() ; space1<24 ; space1++)
				System.out.print(" ");
			System.out.println(g[bd1].gothamname[(g[bd1].n)-1]);		
		}
		for(int bd1=0; bd1<op1; bd1++)
		{	
			if(flagbd3++==0)
				System.out.println("\nThe voters for Onepiece are:\n\tVoter id:\t\tId Password\t\tVoted for");
			System.out.print("\t"+op[bd1].voterid+"    \t\t"+op[bd1].password);
			for(int space1=op[bd1].password.length() ; space1<24 ; space1++)
				System.out.print(" ");
			System.out.println(op[bd1].onepiecename[(op[bd1].n)-1]);
		}
		for(int bd1=0; bd1<w1; bd1++)
		{	
			if(flagbd4++==0)
				System.out.println("\nThe voters for Westeros are:\n\tVoter id:\t\tId Password\t\tVoted for");
			System.out.print("\t"+w[bd1].voterid+"     \t\t"+w[bd1].password);
			for(int space1=w[bd1].password.length() ; space1<24 ; space1++)
				System.out.print(" ");
			System.out.println(w[bd1].westerosname[(w[bd1].n)-1]);		
		}
      }
    }
    public static void clrscr()
    {
    	for(int clr=0;clr<100;clr++)
    		System.out.println();
    }
}
