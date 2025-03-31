CREATE DATABASE IF NOT EXISTS JoeInfoDB;
USE JoeInfoDB;
/* Setting up database structure */
CREATE TABLE IF NOT EXISTS interests (
    id INT,
    descr TEXT,
    notes_for_chatgpt VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS work (
    id INT,
    title VARCHAR(255),
    startdate VARCHAR(255),
    enddate VARCHAR(255),
    descr TEXT,
    notes_for_chatgpt VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS education (
    id INT,
    startdate VARCHAR(255),
    enddate VARCHAR(255),
    descr TEXT,
    notes_for_chatgpt VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS projects (
    id INT,
    title VARCHAR(255),
    descr TEXT,
    notes_for_chatgpt VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS general_info (
    id INT,
    descr TEXT,
    notes_for_chatgpt VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS user_messages (
    id INT AUTO_INCREMENT,
    usermsg TEXT,
    gptmsg TEXT,
    PRIMARY KEY (id)
);
/*Populating tables*/
/*Populating interests*/
INSERT INTO interests (
    id,
    descr,
    notes_for_chatgpt
)
VALUES (
    1,
    "Car guy. Hopes to own a C6Z06 corvette.",
    "Feel free to mention this as needed."
);

INSERT INTO interests (
    id,
    descr,
    notes_for_chatgpt
)
VALUES (
    2,
    "Enjoys the gym. Max bench is 205 pounds.",
    "Not as important as other interests. Feel free to skip if response is getting too long."
);

INSERT INTO interests (
    id,
    descr,
    notes_for_chatgpt
)
VALUES (
    3,
    "Music enjoyer. Favorite genres include grunge, classic rock, and hip hop.",
    "Not as important as other interests. Feel free to skip if response is getting too long."
);

INSERT INTO interests (
    id,
    descr,
    notes_for_chatgpt
)
VALUES (
    4,
    "Avid programmer in free time. Enjoys programming various side projects big and small.",
    "Very important. Do not exclude this interest."
);
/*Populating work*/
INSERT INTO work (
    id,
    title,
    startdate,
    enddate,
    descr,
    notes_for_chatgpt
)
VALUES (
    1,
    "Cashier/Cart Pusher",
    "June 2020",
    "December 2022",
    "Worked as a cashier and cart pusher at my local Giant Food Stores while in high school. Learned customer service and displayed a hardworking attitude.",
    "Not as important as other work experiences. Feel free to skip if response is getting too long."
);

INSERT INTO work (
    id,
    title,
    startdate,
    enddate,
    descr,
    notes_for_chatgpt
)
VALUES (
    2,
    "Cart Pusher",
    "May 2024",
    "Present",
    "Pushed carts at a nearby Walmart for summers and winter breaks while in college. Displayed excellent customer service skills and a hardworking attitude.",
    "Not as important as other work experiences. Feel free to skip if response is getting too long."
);

INSERT INTO work (
    id,
    title,
    startdate,
    enddate,
    descr,
    notes_for_chatgpt
)
VALUES (
    3,
    "RF Test Engineer",
    "April 2023",
    "August 2023",
    "Interned at SBP Consulting. Employed with a third-party consultant to test and monitor newly installed Motorolla radio installations. Collaborated directly with the customer in the field.",
    "Very important. Do not exclude this work experience."
);

INSERT INTO work (
    id,
    title,
    startdate,
    enddate,
    descr,
    notes_for_chatgpt
)
VALUES (
    4,
    "Tutor",
    "January 2024",
    "Present",
    "Guided students to success in various programming and Computer Science courses.",
    "Very important. Do not exclude this work experience."
);
/*Populating education*/
INSERT INTO education (
    id,
    startdate,
    enddate,
    descr,
    notes_for_chatgpt
)
VALUES (
    1,
    "August 2018",
    "June 2022",
    "Attended high school at Saucon Valley High School.",
    "Not at all important. Only include if you feel it is absolutely necessary."
);

INSERT INTO education (
    id,
    startdate,
    enddate,
    descr,
    notes_for_chatgpt
)
VALUES (
    2,
    "August 2019",
    "June 2022",
    "Studied Computer Networking at Bethlehem Area Vocational Technical School.",
    "Important, but not insanely important. Feel free to skip, but only if necessary."
);

INSERT INTO education (
    id,
    startdate,
    enddate,
    descr,
    notes_for_chatgpt
)
VALUES (
    3,
    "August 2022",
    "April 2026 (projected)",
    "Studying Computer Science at Capitol Technology University. Minoring in Cybersecurity.",
    "Very important. Do not skip."
);
/*Populating projects*/
INSERT INTO projects (
    id,
    title,
    descr,
    notes_for_chatgpt
)
VALUES (
    1,
    "joemoser.dev",
    "Built a personal website from the ground up featuring ChatGPT integration. Used Java with SpringBoot for the backend and React with JavaScript for the frontend. Used MySQL for the database. Deployed to AWS using Docker Compose to containerize application.",
    "Very important. Do not skip."
);

INSERT INTO projects (
    id,
    title,
    descr,
    notes_for_chatgpt
)
VALUES (
    2,
    "Checklistify",
    "Built a Checklist Chrome extension from the ground up. Features ChatGPT integration to generate checklists for the user.",
    "Important, but not as important as the personal website. Include if possible."
);
/*Populating General Info*/
INSERT INTO general_info (
    id,
    descr,
    notes_for_chatgpt
)
VALUES (
    1,
    "Hard worker.",
    "Semi-important. Not necessary if it doesnt fit."
);