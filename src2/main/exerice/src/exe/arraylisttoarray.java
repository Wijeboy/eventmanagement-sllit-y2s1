package exe;

import java.util.ArrayList;

public class arraylisttoarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList soma =new ArrayList();
		
		soma.add(10);
		soma.add("mama");
		soma.add("mama koko");
		
		
		System.out.println(soma);
		
		ArrayList <String> ss = new ArrayList<>();
		ss.add("mama ");
		ss.add("thamai ");
		ss.add("palam bokke");
		ss.add("rate rala");
		
		
		for(String item :ss)
		{
			System.out.print(item);
		}
				
		
	}

}
