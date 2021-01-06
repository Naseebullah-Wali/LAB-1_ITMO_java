package first;
import java.util.Random;
import java.lang.Math;
public class lab1{
	

		
		public static void main (String[] args) {
			 int a[]= new int [9];
			for (int i=0; i<9; i++){
				a[i]=6+1;
						}
	double x[] = new double [19];
	for (int i=0; i<19; i++){
		x[i] = get_random();
		}
		
		float d[][]=new float [9][19];
			for(int i=0;i<15;i++){
				for(int j=0; j<19; j++){
			double val;
		if(a[i]==10){
                val= Math.sqrt(Math.cos(Math.sqrt(x[j])));
			}

		else if(a[i]==6 || a[i]==14 || a[i]==18 || a[i]==20){

			val=Math.pow(3*(2-(Math.pow(Math.exp(x[j]/1/4),(Math.exp(x[j]))))),Math.sqrt(x[j])*(Math.asin(x[j]-2/12)+Math.PI));
			}
		else{
			val=Math.pow(0.25/Math.log(Math.pow(2/Math.pow(Math.sin(x[j]),2),Math.pow((4-x[j]/x[j])/2,x[j]))-1),2);}
		 d[i][j]= (float) val;
         System.out.printf("%6.5f",d[i][j]);
         System.out.print(" | ");
     }
     System.out.print("\n");
 }
}
public static float get_random(){
 return (float) Math.random()*(13-(-10)) + (-10); 

	

}}
