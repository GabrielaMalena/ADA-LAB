
public class findNeedle {
	public static void main(String[] args){
		String s="ABCABAABCABAC",ned="CAB";
		//String s= "abcdefghi", ned= "fgh";
		int needleIndice=-1;
		int contador=0;
		int totalNed=0;
		for(int i=0;i<s.length();i++)
		{
			if(i>ned.length()-1)
				needleIndice++;
			else
				needleIndice=i;
			if(s.charAt(i)==ned.charAt(needleIndice))
				contador++;
			else
			{
				needleIndice=0;
				contador=0;
				if(s.charAt(i)==ned.charAt(needleIndice))
					contador++;
				else
					needleIndice=-1;
			}
			if(contador==ned.length())
			{
				needleIndice=-1;
				contador=0;
				totalNed++;
				System.out.println(totalNed+" : aguja encontrada en el indice :"+(i-(ned.length()-1)));
			}
		}
		System.out.print("Total palabras encontradas:"+totalNed);
	}
}

