/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.openregistry.core.service;

import org.aspectj.lang.Aspects;
import org.jasig.openregistry.test.repository.MockSystemOfRecordRepository;
import org.junit.Before;
import org.openregistry.aspect.SoRSpecificationThreadLocalAspect;
import org.openregistry.core.domain.sor.SystemOfRecordHolder;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

public abstract class AbstractIntegrationTests extends AbstractTransactionalJUnit4SpringContextTests {

    @Before
    public void dataBaseSetUp() throws Exception {
        this.simpleJdbcTemplate.update("insert into prd_identifier_types(identifier_t, name, format, private, modifiable, deleted, description) values(null, 'NETID', 'format', false, false, false, 'description')");
        this.simpleJdbcTemplate.update("insert into ctx_data_types(id, data_type, description) values(1, 'NAME', 'FORMAL')");
        this.simpleJdbcTemplate.update("insert into ctx_data_types (id, data_type, description) values(2, 'TERMINATION', 'UNSPECIFIED')");
        this.simpleJdbcTemplate.update("insert into ctx_data_types (id, data_type, description) values(3, 'FOO', 'Foo Description')");
        this.simpleJdbcTemplate.update("insert into ctx_data_types (id, data_type, description) values(4, 'TERMINATION', 'FIRED')");
        this.simpleJdbcTemplate.update("insert into ctx_data_types (id, data_type, description) values(5, 'SPONSOR', 'PERSON')");
        this.simpleJdbcTemplate.update("insert into prd_campuses(id, code, name) values(1, 'cam', 'Busch')");
        this.simpleJdbcTemplate.update("insert into drd_organizational_units(id, campus_id, organizational_unit_t, code, name) values(1, 1, 3, 'cod', 'Department')");
        this.simpleJdbcTemplate.update("insert into prd_system_of_record(id, sor_id) values(1, 'test')");
        this.simpleJdbcTemplate.update("insert into prd_roles(id, title, organizational_unit_id, campus_id, affiliation_t, code, system_of_record_id) values(1, 'Title', 1, 1, 3, 'Code', 1)");

        final SoRSpecificationThreadLocalAspect aspect = Aspects.aspectOf(SoRSpecificationThreadLocalAspect.class);
        aspect.setSystemOfRecordRepository(new MockSystemOfRecordRepository());
    }
}
