package on.diigital.innovation;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import on.diigital.innovation.dominio.Bootcamp;
import on.diigital.innovation.dominio.Conteudo;
import on.diigital.innovation.dominio.Curso;
import on.diigital.innovation.dominio.Dev;
import on.diigital.innovation.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso cursoJavaBasico = new Curso();
		cursoJavaBasico.setTitulo("Java Básico");
		cursoJavaBasico.setDescricao("Aprenda os conceitos básicos sobre Java");
		cursoJavaBasico.setCargaHoraria(8);
		
		Curso cursoDotnet = new Curso();
		cursoDotnet.setTitulo("Java .NET");
		cursoDotnet.setDescricao("Aprenda os conceitos básicos sobre C#");
		cursoDotnet.setCargaHoraria(8);
		
		Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Java Avançado");
		cursoJavaAvancado.setDescricao("Aprenda os conceitos básicos sobre Java");
		cursoJavaAvancado.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Aprendendo Orientação a Objetos com Java");
		mentoria.setDescricao("Imersao sobre os pilares da orientação a objetos");
		mentoria.setData(LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("GFT START #2 Java");
		bootcamp.setInicio(LocalDate.now());
		bootcamp.setFim(bootcamp.getInicio().plusDays(45));
		List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico, cursoJavaAvancado, mentoria);
		bootcamp.setConteudos(conteudosBootcamp);
		
		
		Dev felipao = new Dev();
		felipao.setNome("Felipao");
		
		Dev venilton = new Dev();
		venilton.setNome("Venilton");
		
		felipao.inscrever(cursoDotnet);
		felipao.inscrever(bootcamp);
		felipao.progredir();
		felipao.progredir();
		
		venilton.inscrever(bootcamp);
		venilton.progredir();
		venilton.progredir();
		venilton.progredir();
		
		System.out.println(String.format("XP Felipao: %.2f", felipao.calcularXp()));
		System.out.println(String.format("XP Venilton: %.2f", venilton.calcularXp()));
		
		List<Dev> ranking = Arrays.asList(felipao, venilton).stream()
				.sorted((dev1,dev2)-> Double.compare(dev1.calcularXp(), dev2.calcularXp()))
				.collect(Collectors.toList());
		
		for (Dev dev : ranking) {
			System.out.println(dev.getNome());
			
		}
		
		
		
		
		
		
		
		
	}

}
