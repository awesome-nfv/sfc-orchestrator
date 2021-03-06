package org.project.sfc.com.SfcRepository;

import org.project.sfc.com.SfcModel.SFCdict.SFPdict;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mah on 2/20/17.
 */
@Repository
public interface SFPdictRepo extends CrudRepository<SFPdict, String>, SFPdictRepoCustom {
  SFPdict findFirstById(String id);
}
