package ru.basejava.resume;

import ru.basejava.resume.model.*;

import java.time.YearMonth;
import java.util.*;

public class ResumeTestData {
    private static final String[] phones = {"+7(921) 855-0482", "+7(223) 445-2020", "+7(223) 000-0010", "+7(552) 938-8726"};
    private static final String[] skypes = {"anton.belov", "grigory.kislin", "sergey.ivanov", "petr.tolstoy"};
    private static final String[] emails = {"anton@belov.ru", "grigory@kislin.org", "sergey@ivanov.com", "petr@tolstoy.net"};
    private static final String[] nicNames = {"abelov1995", "gkislin", "s_ivanov", "petr-tolst"};
    private static final String[] homePages = {"http://anton.belov.ru/", "http://grigory.kislin.ru", "https://sergey.ivanov", "https://petr.tolstoy.net"};
    private static final String[] positions = {
            "Ведущий стажировок и корпоративного обучения по Java Web и Enterprise технологиям",
            "Архитектор встроенных систем",
            "Аналитик",
            "Ведущий инженер-разработчик"
    };
    private static final String[] objectives = {
            "Аналитический склад ума, сильная логика, креативность, инициативность. Пурист кода и архитектуры.",
            "Инициативность, коммуникабельность.",
            "Покладистый и исполнительный.",
            "Харизматичный лидер, играю в футбол."
    };
    private static final String[] achievements = {
            "С 2013 года: разработка проектов \"Разработка Web приложения\",\"Java Enterprise\", \"Многомодульный maven. Многопоточность. XML (JAXB/StAX). Веб сервисы (JAX-RS/SOAP). Удаленное взаимодействие (JMS/AKKA)\". Организация онлайн стажировок и ведение проектов. Более 1000 выпускников.",
            "Реализация двухфакторной аутентификации для онлайн платформы управления проектами Wrike. Интеграция с Twilio, DuoSecurity, Google Authenticator, Jira, Zendesk.",
            "Налаживание процесса разработки и непрерывной интеграции ERP системы River BPM. Интеграция с 1С, Bonita BPM, CMIS, LDAP. Разработка приложения управления окружением на стеке: Scala/Play/Anorm/JQuery. Разработка SSO аутентификации и авторизации различных ERP модулей, интеграция CIFS/SMB java сервера.",
            "Реализация c нуля Rich Internet Application приложения на стеке технологий JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Commet, HTML5, Highstock для алгоритмического трейдинга.",
            "Создание JavaEE фреймворка для отказоустойчивого взаимодействия слабо-связанных сервисов (SOA-base архитектура, JAX-WS, JMS, AS Glassfish). Сбор статистики сервисов и информации о состоянии через систему мониторинга Nagios. Реализация онлайн клиента для администрирования и мониторинга системы по JMX (Jython/ Django).",
            "Реализация протоколов по приему платежей всех основных платежных системы России (Cyberplat, Eport, Chronopay, Сбербанк), Белоруcсии(Erip, Osmp) и Никарагуа."
    };
    private static final String[] qualifications = {
            "JEE AS: GlassFish (v2.1, v3), OC4J, JBoss, Tomcat, Jetty, WebLogic, WSO2",
            "Version control: Subversion, Git, Mercury, ClearCase, Perforce",
            "DB: PostgreSQL(наследование, pgplsql, PL/Python), Redis (Jedis), H2, Oracle, MySQL, SQLite, MS SQL, HSQLDB",
            "Languages: Java, Scala, Python/Jython/PL-Python, JavaScript, Groovy, XML/XSD/XSLT, SQL, C/C++, Unix shell scripts",
            "Java Frameworks: Java 8 (Time API, Streams), Guava, Java Executor, MyBatis, Spring (MVC, Security, Data, Clouds, Boot), JPA (Hibernate, EclipseLink), Guice, GWT(SmartGWT, ExtGWT/GXT), Vaadin, Jasperreports, Apache Commons, Eclipse SWT, JUnit, Selenium (htmlelements).",
            "Python: Django.",
            "JavaScript: jQuery, ExtJS, Bootstrap.js, underscore.js",
            "Scala: SBT, Play2, Specs2, Anorm, Spray, Akka",
            "Технологии: Servlet, JSP/JSTL, JAX-WS, REST, EJB, RMI, JMS, JavaMail, JAXB, StAX, SAX, DOM, XSLT, MDB, JMX, JDBC, JPA, JNDI, JAAS, SOAP, AJAX, Commet, HTML5, ESB, CMIS, BPMN2, LDAP, OAuth1, OAuth2, JWT.",
            "Инструменты: Maven + plugin development, Gradle, настройка Ngnix, администрирование Hudson/Jenkins, Ant + custom task, SoapUI, JPublisher, Flyway, Nagios, iReport, OpenCmis, Bonita, pgBouncer.",
            "Отличное знание и опыт применения концепций ООП, SOA, шаблонов проектрирования, архитектурных шаблонов, UML, функционального программирования",
            "Родной русский, английский \"upper intermediate\""
    };
    private static final String[] experiences = {
            "Java Online Projects", "http://javaops.ru/", "2013-10", "2020-12", "Автор проекта.", "Создание, организация и проведение Java онлайн проектов и стажировок.",
            "Wrike", "https://www.wrike.com/", "2014-10", "2016-01", "Старший разработчик (backend)", "Проектирование и разработка онлайн платформы управления проектами Wrike (Java 8 API, Maven, Spring, MyBatis, Guava, Vaadin, PostgreSQL, Redis). Двухфакторная аутентификация, авторизация по OAuth1, OAuth2, JWT SSO.",
            "RIT Center", "", "2012-04", "2014-10", "Java архитектор", "Организация процесса разработки системы ERP для разных окружений: релизная политика, версионирование, ведение CI (Jenkins), миграция базы (кастомизация Flyway), конфигурирование системы (pgBoucer, Nginx), AAA via SSO. Архитектура БД и серверной части системы. Разработка интергационных сервисов: CMIS, BPMN2, 1C (WebServices), сервисов общего назначения (почта, экспорт в pdf, doc, html). Интеграция Alfresco JLAN для online редактирование из браузера документов MS Office. Maven + plugin development, Ant, Apache Commons, Spring security, Spring MVC, Tomcat,WSO2, xcmis, OpenCmis, Bonita, Python scripting, Unix shell remote scripting via ssh tunnels, PL/Python",
            "Luxoft (Deutsche Bank)", "http://www.luxoft.ru/", "2010-12", "2012-04", "Ведущий программист", "Участие в проекте Deutsche Bank CRM (WebLogic, Hibernate, Spring, Spring MVC, SmartGWT, GWT, Jasper, Oracle). Реализация клиентской и серверной части CRM. Реализация RIA-приложения для администрирования, мониторинга и анализа результатов в области алгоритмического трейдинга. JPA, Spring, Spring-MVC, GWT, ExtGWT (GXT), Highstock, Commet, HTML5.",
            "Alcatel", "http://www.alcatel.ru/", "1997-09", "2005-01", "Инженер по аппаратному и программному тестированию", "Тестирование, отладка, внедрение ПО цифровой телефонной станции Alcatel 1000 S12 (CHILL, ASM)."
    };
    private static final String[] educations = {
            "Coursera", "https://www.coursera.org/course/progfun", "2013-10", "2020-12", "\"Functional Programming Principles in Scala\" by Martin Odersky",
            "Luxoft", "http://www.luxoft-training.ru/training/catalog/course.html?ID=22366", "2011-03", "2011-04", "Курс \"Объектно-ориентированный анализ ИС. Концептуальное моделирование на UML.\"",
            "Siemens AG", "http://www.siemens.ru/", "2005-01", "2005-04", "3 месяца обучения мобильным IN сетям (Берлин)",
            "Alcatel", "http://www.alcatel.ru/", "1997-09", "1998-03", "6 месяцев обучения цифровым телефонным сетям (Москва)"
    };
    private static final Random random = new Random();
    private static final Organisations organisations = Organisations.getInstance();

    public static Resume generateRandomResume(String uuid, String fullName) {

        Map<ContactType, String> contacts = new EnumMap<>(ContactType.class);

        contacts.put(ContactType.PHONE, getRandom(phones));
        contacts.put(ContactType.SKYPE, getRandom(skypes));
        contacts.put(ContactType.EMAIL, getRandom(emails));
        contacts.put(ContactType.LINKEDIN, "https://www.linkedin.com/in/" + getRandom(nicNames));
        contacts.put(ContactType.GITHUB, "https://github.com/" + getRandom(nicNames));
        contacts.put(ContactType.STACKOVERFLOW, "https://stackoverflow.com/users/" + getRandom(nicNames));
        contacts.put(ContactType.HOMEPAGE, getRandom(homePages));

        Map<SectionType, Section> sections = new EnumMap<>(SectionType.class);

        sections.put(SectionType.PERSONAL, new SingleLineSection(getRandom(positions)));
        sections.put(SectionType.OBJECTIVE, new SingleLineSection(getRandom(objectives)));

        sections.put(SectionType.ACHIEVEMENT, new BulletedListSection(getRandom(achievements), getRandom(achievements)));
        sections.put(SectionType.QUALIFICATIONS, new BulletedListSection(getRandom(qualifications), getRandom(qualifications), getRandom(qualifications)));

        int experiencesCount = 3;

        Link link = null;

        Experience[] allExperiences = new Experience[experiencesCount];
        for (int i = 0; i < experiencesCount; i++) {
            int randomExperience = random.nextInt(educations.length / 6) * 6;

            Experience experience = new Experience(
                    YearMonth.parse(experiences[randomExperience + 2]),
                    YearMonth.parse(experiences[randomExperience + 3]),
                    experiences[randomExperience + 4],
                    experiences[randomExperience + 5]);

            allExperiences[i] = experience;

            link = organisations.get(experiences[randomExperience],experiences[randomExperience + 1]);

        }

        sections.put(SectionType.EXPERIENCE, new ExperienceSection(link, allExperiences));

        int educationsCount = 3;

        Experience[] allEducations = new Experience[educationsCount];
        for (int i = 0; i < educationsCount; i++) {
            int randomEducation = random.nextInt(educations.length / 5) * 5;

            Experience education = new Experience(
                    YearMonth.parse(educations[randomEducation + 2]),
                    YearMonth.parse(educations[randomEducation + 3]),
                    educations[randomEducation + 4],
                    "");

            allEducations[i] = education;

            link = organisations.get(experiences[randomEducation],experiences[randomEducation + 1]);

        }

        sections.put(SectionType.EDUCATION, new ExperienceSection(link, allEducations));

        return new Resume(uuid, fullName, contacts, sections);
    }

    public static void printResume(Resume resume) {
        System.out.println("\n=============== "+resume.getFullName()+ " ===============");
        for (ContactType contactType : ContactType.values()) {
            String contact;
            String title = contactType.getTitle();
            String value = resume.getContacts().get(contactType);
            switch (contactType) {
                case PHONE:
                    contact = title + ": " + value;
                    break;
                case SKYPE:
                    contact = title + ": <a href='skype:" + value + "'>" + value + "<a>";
                    break;
                case EMAIL:
                    contact = title + ": <a href='mailto:" + value + "'>" + value + "<a>";
                    break;
                default:
                    contact = "<a href='" + value + "'>" + title + "<a>";
            }
            System.out.println(contact);
        }

        for (SectionType sectionType : SectionType.values()) {
            System.out.println("\n"+sectionType.getTitle());
            if(!sectionType.equals(SectionType.EXPERIENCE) && !sectionType.equals(SectionType.EDUCATION)){
                System.out.println(resume.getSections().get(sectionType));
            }else {
                ExperienceSection section = (ExperienceSection) resume.getSections().get(sectionType);
                System.out.println(section);
                List<Experience> experiences = section.getExperiences();
                for (Experience experience : experiences) {
                    System.out.println(experience);
                }
            }
        }
    }

    public static void main(String[] args) {
        Resume resume = generateRandomResume(UUID.randomUUID().toString(), "Resume Test Data");
        printResume(resume);
    }

    private static String getRandom(String[] array) {
        return array[random.nextInt(array.length)];
    }
}
