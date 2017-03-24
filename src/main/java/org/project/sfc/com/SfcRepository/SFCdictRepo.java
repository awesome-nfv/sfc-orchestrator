package org.project.sfc.com.SfcRepository;

import org.project.sfc.com.SfcModel.SFCdict.SFCdict;
import org.project.sfc.com.SfcModel.SFCdict.SfcDict;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mah on 2/20/17.
 */
public interface SFCdictRepo extends CrudRepository<SfcDict, String> {
  SfcDict findFirstById(String id);

}
