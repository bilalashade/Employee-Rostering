/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaweb.employeerostering.domain.violation;

import org.optaplanner.core.api.score.buildin.hardmediumsoftlong.HardMediumSoftLongScore;
import org.optaweb.employeerostering.domain.employee.EmployeeAvailability;
import org.optaweb.employeerostering.domain.shift.Shift;

public class UndesiredTimeslotForEmployeePenalty implements ConstraintMatchView {

    private EmployeeAvailability employeeAvailability;
    private Shift shift;

    private HardMediumSoftLongScore score;

    public UndesiredTimeslotForEmployeePenalty() {

    }

    public UndesiredTimeslotForEmployeePenalty(Shift shift, EmployeeAvailability employeeAvailability,
                                               HardMediumSoftLongScore score) {
        this.shift = shift;
        this.employeeAvailability = employeeAvailability;
        this.score = score;
    }

    public EmployeeAvailability getEmployeeAvailability() {
        return employeeAvailability;
    }

    public void setEmployeeAvailability(EmployeeAvailability employeeAvailability) {
        this.employeeAvailability = employeeAvailability;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public HardMediumSoftLongScore getScore() {
        return score;
    }

    public void setScore(HardMediumSoftLongScore score) {
        this.score = score;
    }
}
