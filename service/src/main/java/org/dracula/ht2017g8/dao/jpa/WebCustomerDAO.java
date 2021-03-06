package org.dracula.ht2017g8.dao.jpa;

import org.dracula.ht2017g8.po.jpa.WebCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author dk
 */
@RepositoryRestResource(path="WebCustomer")
public interface WebCustomerDAO extends JpaRepository<WebCustomer, Long>{
}
