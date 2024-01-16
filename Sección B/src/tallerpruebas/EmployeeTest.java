package tallerpruebas;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
;

public class EmployeeTest {
	
	final double DELTA=0.001;//Tolerancia para comparacion de valores float
	final double mesImpar=386.0/12*2;
	final double noUSD=0.95;
	
	@Test
	public void TestCsWorker() {
		float valorEsperado=(float) (1000 + mesImpar);
		Employee empleado=new Employee(1000,"USD",10,EmployeeType.Worker);
		assertEquals(valorEsperado,empleado.cs(),DELTA);
	}
	
	@Test
	public void TestCsSupervisor() {
		int bonusPercentaje=15;
		float valorEsperado=(float) (2000 + mesImpar + bonusPercentaje*0.35F);
		Employee supervisor= new Employee(2000,"USD",bonusPercentaje,EmployeeType.Supervisor);
		assertEquals(valorEsperado,supervisor.cs(),DELTA);
		
	}
	
	@Test
	public void TestCsManager() {
		int bonusPercentaje=20;
		float valorEsperado=(float) (5000+mesImpar+bonusPercentaje*0.7F);
		Employee manager= new Employee(5000,"USD",bonusPercentaje,EmployeeType.Manager);
		assertEquals(valorEsperado,manager.cs(),DELTA);
	}
	
	@Test
	public void TestCsNoUSD() {
		float valorEsperado=(float) (1000*0.95+mesImpar);
		Employee empleado2=new Employee(1000,"YEN",10,EmployeeType.Worker);
		assertEquals(valorEsperado,empleado2.cs(),DELTA);
	}
	
	/*
	@Test public void TestCsMesPar() {
		float sueldo=1000;
		Employee empleado3= new Employee(1000,"USD",10,EmployeeType.Worker);
		assertEquals(sueldo,empleado3.cs(),DELTA);
	}
	*/
	
	@Test
	public void testCYBWorker() {
		Employee empleado = new Employee(1000, "USD", 0.10F, EmployeeType.Worker);
		assertEquals(386F, empleado.CalculateYearBonus(), DELTA);
	}
	
	@Test
	public void testCYBWorkerNoUSD() {
		Employee empleado = new Employee(1150, "EUR", 0.10F, EmployeeType.Worker);
		assertEquals(386F, empleado.CalculateYearBonus(), DELTA);
	}
	
	@Test
	public void TestCYBSupervisor() {
		Employee supervisor = new Employee(1300, "USD", 0.15F , EmployeeType.Supervisor);
		assertEquals(1493F, supervisor.CalculateYearBonus(), DELTA);
	}
	
	@Test
	public void TestCYBSupervisorNoUSD() {
		Employee supervisor = new Employee(1500, "EUR", 0.15F , EmployeeType.Supervisor);
		assertEquals(1618F, supervisor.CalculateYearBonus(), DELTA);
	}
	
	@Test
	public void TestCYBManager() {
		Employee manager = new Employee(2000, "USD", 0.2F, EmployeeType.Manager);
		assertEquals(2386F, manager.CalculateYearBonus(), DELTA);
	}
	
	@Test
	public void TestCYBManagerNoUSD() {
		Employee manager = new Employee(2250, "EUR", 0.2F, EmployeeType.Manager);
		assertEquals(2523.5F, manager.CalculateYearBonus(), DELTA);
	}
	
}
