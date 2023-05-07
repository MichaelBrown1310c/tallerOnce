package puntoCuatro;

public class factorial {
	  private int num;

	  public factorial(int num) {
	    this.num = num;
	  }

	  public int getFactorial() {
	    int factorial = 1;
	    for (int i = 1; i <= num; i++) {
	      factorial *= i;
	    }
	    return factorial;
	  }

	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Factorial: ");
	    sb.append(num);
	    sb.append("! = ");
	    for (int i = 1; i <= num; i++) {
	      sb.append(i);
	      if (i != num) {
	        sb.append(" * ");
	      }
	    }
	    sb.append(" = ");
	    sb.append(getFactorial());
	    return sb.toString();
	  }
	}