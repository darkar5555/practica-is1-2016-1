package repository;

public interface RepositoryFactory {
	AccountRepository createAccountRepository();
	PersonRepository createPersonRepository();
	Alumno.Repository createAlumnoRepository();
	Curso.Repository createCursoRepository();
}
