package mz.co.pratics.common.persistence;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import com.github.f4b6a3.ulid.UlidCreator;

public class UlidIdentifierGenerator  implements  IdentifierGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor session, Object  entity) {

        return UlidCreator.getUlid().toString();
        
    }

}
