package calculatingCurrency;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatingCurrency {
	
	public static void calculateCurrency(double[] number3Array) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the amount of money: ");
		double amount = input.nextDouble();
		
		System.out.println("Enter 1: for EUR, 2: for USD, 3: for GBP, 4: for BTC, 5: for ETH, 6: for FKE");
	    int num1 = input.nextInt();
	 	
		System.out.println("Enter 1: for EUR, 2: for USD, 3: for GBP, 4: for BTC, 5: for ETH, 6: for FKE");
	    int num2 = input.nextInt();
			
		if (num1 == 1 && num2 == 1) {
			System.out.print(amount + " EUR: ");
		    System.out.printf("%.18f", amount);
			System.out.println( " EUR.");
		}
		else if (num1 == 1 && num2 == 2) {
			BigDecimal usd = new BigDecimal(eur_usd(amount, number3Array));
			System.out.print(amount + " EUR: ");
			System.out.printf("%.18f", usd);
			System.out.println( " USD.");
		}
		else if (num1 == 1 && num2 == 3) {
			BigDecimal gbp = new BigDecimal(eur_gbp(amount, number3Array));
			System.out.print(amount + " EUR: ");
			System.out.printf("%.18f", gbp);
			System.out.println( " GBP.");
		}
		else if (num1 == 1 && num2 == 4) {
			BigDecimal btc = new BigDecimal(eur_btc(amount, number3Array));
			System.out.print(amount + " EUR: ");
			System.out.printf("%.18f", btc);
			System.out.println( " BTC.");
		}
		else if (num1 == 1 && num2 == 5) {
			BigDecimal eth = new BigDecimal(eur_eth(amount, number3Array));
		    System.out.print(amount + " EUR: ");
			System.out.printf("%.18f", eth);
			System.out.println( " ETH.");
		}
		else if (num1 == 1 && num2 == 6) {
			BigDecimal fke = new BigDecimal(eur_fke(amount, number3Array));
		    System.out.print(amount + " EUR: ");
			System.out.printf("%.18f", fke);
			System.out.println( " FKE.");
		}
        else if (num1 == 2 && num2 == 1) {
        	BigDecimal eur1 = new BigDecimal(usd_eur(amount,number3Array));
		    System.out.print(amount + " USD: ");
		    System.out.printf("%.18f", eur1);
		    System.out.println(" EUR.");
		}
		else if (num1 == 3 && num2 == 1) {
			BigDecimal eur2 = new BigDecimal(gbp_eur(amount, number3Array));
			System.out.print(amount + " GBP: ");
		    System.out.printf("%.18f", eur2);
		    System.out.println(" EUR.");
		}
	    else if (num1 == 4 && num2 == 1) {
	    	BigDecimal eur3 = new BigDecimal(btc_eur(amount, number3Array));
	    	System.out.print(amount + " BTC: ");
		    System.out.printf("%.18f", eur3);
		    System.out.println(" EUR.");
	    }
		else if (num1 == 5 && num2 == 1) {
			BigDecimal eur4 = new BigDecimal(eth_eur(amount, number3Array));
			System.out.print(amount + " ETH: ");
		    System.out.printf("%.18f", eur4);
		    System.out.println(" EUR.");
		}
		else if (num1 == 6 && num2 == 1) {
			BigDecimal eur5 = new BigDecimal(fke_eur(amount, number3Array));
			System.out.print(amount + " FKE: ");
		    System.out.printf("%.18f", eur5);
		    System.out.println(" EUR.");	
		}
		else if (num1 == 2 && num2 == 2) {
			System.out.print(amount + " USD: ");
			System.out.printf("%.18f", amount);
			System.out.println( " USD.");
		}
		else if (num1 == 2 && num2 == 3) {
		   //usd_gbp
		   double amount1 = usd_eur(amount, number3Array);
		   double amount2 = eur_gbp(amount1, number3Array);
		   System.out.print(amount + " USD: ");
		   System.out.printf("%.18f", amount2);
		   System.out.println(" GBP.");
		}
		else if(num1 == 2 && num2 == 4) {
			//usd_btc
			double amount1 = usd_eur(amount, number3Array);
			double amount2 = eur_btc(amount1, number3Array);
			System.out.print(amount + " USD: ");
			System.out.printf("%.18f", amount2);
			System.out.println(" BTC.");
		}
		else if (num1 == 2 && num2 == 5) {
			//usd_eth
			double amount1 = usd_eur(amount, number3Array);
			double amount2 = eur_eth(amount1, number3Array);
			System.out.print(amount + " USD: ");
			System.out.printf("%.18f", amount2);
			System.out.println(" ETH.");
		}
		else if(num1 == 2 && num2 == 6) {
			//usd_fke
			double amount1 = usd_eur(amount, number3Array);
		    double amount2 = eur_btc(amount1, number3Array);
			System.out.print(amount + " USD: ");
			System.out.printf("%.18f", amount2);
		    System.out.println(" FKE.");
		}
		else if (num1 == 3 && num2 == 1) {
			//gbp_eur
			double amount1 = gbp_eur(amount, number3Array);
			System.out.print(amount + " GBP: ");
			System.out.printf("%.18f", amount1);
		    System.out.println(" EUR.");
		}	
		else if (num1 == 3 && num2 == 2) {
			//gbp_usd
			double amount1 = gbp_eur(amount, number3Array);
		    double amount2 = eur_usd(amount1, number3Array);
			System.out.print(amount + " GBP: ");
			System.out.printf("%.18f", amount2);
		    System.out.println(" USD.");
		}	
		else if (num1 == 3 && num2 == 3) {
			System.out.print(amount + " GBP: ");
			System.out.printf("%.18f", amount);
			System.out.println( " GBP.");
		}
		else if (num1 == 3 && num2 == 4) {
		   //gbp_btc
		   double amount1 = gbp_eur(amount, number3Array);
		   double amount2 = eur_btc(amount1, number3Array);
		   System.out.print(amount + " GBP: ");
		   System.out.printf("%.18f", amount2);
		   System.out.println(" BTC.");
		}
		else if(num1 == 3 && num2 == 5) {
			//gbp_eth
			double amount1 = gbp_eur(amount, number3Array);
			double amount2 = eur_eth(amount1, number3Array);
			System.out.print(amount + " GBP: ");
			System.out.printf("%.18f", amount2);
			System.out.println(" ETH.");
		}
		else if (num1 == 3 && num2 == 6) {
			//gbp_fke
			double amount1 = gbp_eur(amount, number3Array);
			double amount2 = eur_eth(amount1, number3Array);
			System.out.print(amount + " GBP: ");
			System.out.printf("%.18f", amount2);
			System.out.println(" FKE.");
		}			
		else if (num1 == 4 && num2 == 1) {
			//btc_eur
			double amount1 = btc_eur(amount, number3Array);
			System.out.print(amount + " BTC: ");
			System.out.printf("%.18f", amount1);
			System.out.println(" EUR.");
		}
			
		else if (num1 == 4 & num2 == 2) {
			 //btc_usd
			 double amount1 = btc_eur(amount, number3Array);
			 double amount2 = eur_usd(amount1, number3Array);
			 System.out.print(amount + " BTC: ");
			 System.out.printf("%.18f", amount2);
			 System.out.println(" USD.");
		}
	    else if(num1 == 4 && num2 == 3) {
		   //btc_gbp
		   double amount1 = btc_eur(amount, number3Array);
		   double amount2 = eur_gbp(amount1, number3Array);
		   System.out.print(amount + " BTC: ");
		   System.out.printf("%.18f", amount2);
		   System.out.println(" GBP.");
		}
		else if (num1 == 4 & num2 == 4) {
			//btc_btc
			System.out.print(amount + " BTC: ");
			System.out.printf("%.18f", amount);
			System.out.println(" BTC.");
		}
	    else if(num1 == 4 && num2 == 5) {
		   //btc_eth
		   double amount1 = btc_eur(amount, number3Array);
		   double amount2 = eur_eth(amount1, number3Array);
		   System.out.print(amount + " BTC: ");
		   System.out.printf("%.18f", amount2);
		   System.out.println(" ETH.");
		}
		else if (num1 == 4 && num2 == 6) {
			//gbp_fke
		    double amount1 = gbp_eur(amount, number3Array);
		    double amount2 = eur_eth(amount1, number3Array);
		    System.out.print(amount + " GBP: ");
		    System.out.printf("%.18f", amount2);
		    System.out.println(" FKE.");
		}
		else if (num1 == 5 && num2 == 1) {
			//eth_eur
			double amount1 = eth_eur(amount, number3Array);
			System.out.print(amount + " ETH: ");
			System.out.printf("%.18f", amount1);
			System.out.println(" EUR.");
		}			
		else if (num1 == 5 & num2 == 2) {
			 //eth_usd
			 double amount1 = eth_eur(amount, number3Array);
			 double amount2 = eur_usd(amount1, number3Array);
			 System.out.print(amount + " ETH: ");
			 System.out.printf("%.18f", amount2);
			 System.out.println(" USD.");
		}
	    else if(num1 == 5 && num2 == 3) {
		   //eth_gbp
		   double amount1 = eth_eur(amount, number3Array);
		   double amount2 = eur_gbp(amount1, number3Array);
		   System.out.print(amount + " ETH: ");
		   System.out.printf("%.18f", amount2);
		   System.out.println(" GBP.");
		}
		else if (num1 == 5 & num2 == 4) {
			//eth_btc
			double amount1 = eth_eur(amount, number3Array);
			double amount2 = eur_btc(amount1, number3Array);
			System.out.print(amount + " ETH: ");
			System.out.printf("%.18f", amount2);
			System.out.println(" BTC.");
		}
	    else if(num1 == 5 && num2 == 5) {
		   //eth_eth
		   System.out.print(amount + " ETH: ");
		   System.out.printf("%.18f", amount);
		   System.out.println(" ETH.");
		}
		else if (num1 == 5 && num2 == 6) {
			//eth_fke
		    double amount1 = eth_eur(amount, number3Array);
		    double amount2 = eur_fke(amount1, number3Array);
		    System.out.print(amount + " ETH: ");
		    System.out.printf("%.18f", amount2);
		    System.out.println(" FKE.");
		}
		else if (num1 == 5 && num2 == 1) {
			//fke_eur
			double amount1 = fke_eur(amount, number3Array);
			System.out.print(amount + " FKE: ");
			System.out.printf("%.18f", amount1);
			System.out.println(" EUR.");
		}
		else if (num1 == 6 & num2 == 2) {
			 //fke_usd
			 double amount1 = fke_eur(amount, number3Array);
			 double amount2 = eur_usd(amount1, number3Array);
			 System.out.print(amount + " FKE: ");
			 System.out.printf("%.18f", amount2);
			 System.out.println(" USD.");
		}
	    else if(num1 == 6 && num2 == 3) {
		   //fke_gbp
		   double amount1 = fke_eur(amount, number3Array);
		   double amount2 = eur_gbp(amount1, number3Array);
		   System.out.print(amount + " FKE: ");
		   System.out.printf("%.18f", amount2);
		   System.out.println(" GBP.");
		}
		else if (num1 == 6 & num2 == 4) {
			//fke_btc
			double amount1 = fke_eur(amount, number3Array);
			double amount2 = eur_btc(amount1, number3Array);
			System.out.print(amount + " FKE: ");
			System.out.printf("%.18f", amount2);
			System.out.println(" BTC.");
		}
	   	else if (num1 == 6 && num2 == 5) {
			//fke_eth
		    double amount1 = fke_eur(amount, number3Array);
		    double amount2 = eur_eth(amount1, number3Array);
		    System.out.print(amount + " FKE: ");
		    System.out.printf("%.18f", amount2);
		    System.out.println(" ETH.");
		}
		else if(num1 == 6 && num2 == 6) {
			//fke_fke
			System.out.print(amount + " FKE: ");
			System.out.printf("%.18f", amount);
			System.out.println(" FKE.");
			}
		else {
			System.out.println("Please restart the program!");
		}
		input.close();
	}

    public static double eur_usd(double amount, double [] number3Array) {
    	double usd = amount / number3Array[1];
	    return usd;
    }

    public static double eur_gbp(double amount, double [] number3Array) {
    	double gbp = amount / number3Array[2];
	    return gbp;
    }

    public static double eur_btc(double amount, double [] number3Array) {
    	double btc = amount / number3Array[3];
	    return btc;
    }

    public static double eur_eth(double amount, double [] number3Array) {
    	double eth = amount / number3Array[4];
	    return eth;
    }
    
    public static double eur_fke(double amount, double [] number3Array) {
    	double fke = amount / number3Array[5];
	    return fke;
    }

    public static double usd_eur(double amount, double [] number3Array) {
    	double eur1 = amount * number3Array[1];
	    return eur1;
    }

    public static double gbp_eur(double amount, double [] number3Array) {
    	double eur2 = amount * number3Array[2];
	    return eur2;
    }

    public static double btc_eur(double amount, double [] number3Array) {
	    double eur3 = amount * number3Array[3];
	    return eur3;
    }

    public static double eth_eur(double amount, double [] number3Array) {
    	double eur4 = amount * number3Array[4];
	    return eur4;
    }
    
    public static double fke_eur(double amount, double [] number3Array) {
    	double eur5 = amount * number3Array[5];
	    return eur5;
    }
}
