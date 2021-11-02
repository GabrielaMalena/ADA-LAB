
public class TimeComplexity {


	//Review of Time Complexity
	//Q1: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  O(n)
	for (i = 0; i < n; i++) {    -----> n
		statement;               -----> n
		                        Tiempo: O(n)
	}


	
	// Q2: What is the time complexity of
	//Analizando su tiempo de complejidad:
	////Su tiempo de Complejidad es ---->  O(n)
	for (i = n; i > 0; i--) {    -----> n
	    statement;               -----> n
	                           Tiempo: O(n)
	}
	
	
	
	// Q3: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  O(n)
	for (i = 0; i < n; i=i+5) {  -----> n
		statement;               -----> n/2
		                         Tiempo: O(n)
	}

	
	
	
	
	// Q4: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  O(n^2)
	for (i = 0; i < n; i++) {     ------> n+1
	    for (j = 0; j < n; j++) { ------> n(n+1)
	        statement;            ------> n
	                               Tiempo: O(n^2)
	    }
	}
	
	
	
	
	
	// Q5: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  O(n^2)
	for (i = 0; i < n; i++) {      ------> n+1
	    for (j = 0; j < i; j++) {  ------> n(n+1)
	        statement;             ------> n
	                                Tiempo: O(n^2)
	    }
	}



	
	
	// Q6: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  O (sqrt(n))
	p = 0                           ------> n
	for (i = 1; p <= n; i++) {      ------> n(n+2)
	    p = p + i;                  ------> 
	                                 Tiempo: O (sqrt(n))
	}
	
	
	
	
	// Q7: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  log2(n)
	for (i = 1; i < n; i = i*2) {    -------> log (n)
	    statement;                   ------->   n
	                                 Tiempo:   log2(n)
	}
	
	
	
	
	// Q8: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  log2(n)
	for (i = n; i >= 1; i = i/2) {   -------> log(n)
		statement;                   ------->  n
		                              Tiempo:  log2(n)
	}

	
	
	
	// Q9: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  O(sqrt(n))
	for (i = 0; i * i < n; i++) {    -------> log(n)
	    statement;                   ------->  n
	                                  Tiempo: = O(sqrt(n))
	}
	
	
	
	
	
	// Q10: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  O(n)
	for (i = 0; i < n; i++) {       --------> n+1
		statement;                  --------> n
	}

	for (j = 0; j < n; j++) {       --------> (n+1)
		statement;                  --------> n
		                             Tiempo: O(2n)
		                             Tiempo: O(n)
	}



	
	
	
	// Q11: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ---->  O(log(log(n)))
	p = 0
	for (i = 1; i < n; i = i * 2) {    ------> log(n)
	    p++;                           ------> n
	}

	for (j = 1; j < p; j = j * 2) {    -------> log(n)
	    statement;                     -------> n
	                                    Tiempo: O(log(log(n)))
	}
	
	
	
	
	
	
	
	// Q12: What is the time complexity of
	//Analizando su tiempo de complejidad:
	//Su tiempo de Complejidad es ----> O(n*log2(n))
	for (i = 0; i < n; i++) {            ----->  n+1
	    for (j = 1; j < n; j = j * 2) {  -----> log(n)*2
	        statement;                   -----> n
	                                     Tiempo: O(n*log2(n))
	    }
	}


