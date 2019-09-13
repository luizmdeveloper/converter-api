package br.com.luizmariodeveloper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luizmariodeveloper.model.Converter;

@Repository
public interface ConverterRepository extends JpaRepository<Converter, Long> {

}
