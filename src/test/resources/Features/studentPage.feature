Feature: Students login page test

  Background:
    Given student is on login page

  @Student
  Scenario Outline: Verify work of the students
    When student clicks on sign in button
    When student enters '<username>' and '<password>' and click on login button
    When student is navigated to student page and verify student's name
    When student clicks on start course button
    When student is navigated to course page
    When student clicks on table view button
    Then student can see his progress and calculate average

    Examples:
      | username                 | password        |
      | 223a.alharbi@sany.org    | 223a.alharbi    |
      | 223m.alhyawah@sany.org   | 223m.alhyawah   |
      | 222r.aljamal@sany.org    | 222r.aljamal    |
      | 223s.aljamal@sany.org    | 223s.aljamal    |
      | 224m.almasqari@sany.org  | 224m.almasqari  |
      | 223t.bennett@sany.org    | 223t.bennett    |
      | 223b.cruz@sany.org       | 223b.cruz       |
      | 222n.brown@sany.org      | 222n.brown      |
      | 224k.garcia@sany.org     | 224k.garcia     |
      | 223a.genther@sany.org    | 223a.genther    |
      | 223l.hadzic@sany.org     | 223l.hadzic     |
      | 223d.haynes@sany.org     | 223d.haynes     |
      | 224a.hodzic@sany.org     | 224a.hodzic     |
      | 223e.hodzic@sany.org     | 223e.hodzic     |
      | 223m.huseinovic@sany.org | 223m.huseinovic |
      | 224m.jusic@sany.org      | 224m.jusic      |
      | 224m.keawpinna@sany.org  | 224m.keawpinna  |
      | 223d.mclean@sany.org     | 223d.mclean     |
      | 223n.mugalli@sany.org    | 223n.mugalli    |
      | 224e.mujic@sany.org      | 224e.mujic      |
      | 224e.nadarevic@sany.org  | 224e.nadarevic  |
      | 223e.omerovic@sany.org   | 223e.omerovic   |
      | 224h.poljakovic@sany.org | 224h.poljakovic |
      | 223a.redzic@sany.org     | 223a.redzic     |
      | 223m.rodriguez@sany.org  | 223m.rodriguez  |
      | 223a.sann@sany.org       | 223a.sann       |
      | 224l.steppello@sany.org  | 224l.steppello  |
      | 223c.service@sany.org    | 223c.service    |
      | 224g.shabalah@sany.org   | 224g.shabalah   |
      | 224j.sin@sany.org        | 224j.sin        |
      | 223k.smith@sany.org      | 223k.smith      |
      | 224i.solorzano@sany.org  | 224i.solorzano  |
      | 224m.stenson@sany.org    | 224m.stenson    |
      | 223j.surinach@sany.org   | 223j.surinach   |
      | 223z.tricic@sany.org     | 223z.tricic     |
      | 223a.wynn@sany.org       | 223a.wynn       |







