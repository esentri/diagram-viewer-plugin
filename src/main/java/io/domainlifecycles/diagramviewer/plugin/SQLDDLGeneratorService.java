package io.domainlifecycles.diagramviewer.plugin;

import io.domainlifecycles.mirror.api.AggregateRootMirror;
import io.domainlifecycles.mirror.api.DomainMirror;

public interface SQLDDLGeneratorService {

    String generateSQL(
            DomainMirror domainMirror,
            AggregateRootMirror aggregateRootMirror,
            SQLDialect sqlDialect,
            boolean audit,
            String sqlSchemaName);

}
