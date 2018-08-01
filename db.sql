
truncate page;
truncate division;
truncate media;
insert into page (pageid, name, parent_pageid) values (1,'TOP_MENU',null);
insert into page (pageid, name, parent_pageid) values (11,'Home',1);
insert into page (pageid, name, parent_pageid) values (12,'Places',1);
insert into page (pageid, name, parent_pageid) values (13,'Contact',1);
insert into page (pageid, name, parent_pageid) values (121,'Iceland',1);
insert into page (pageid, name, parent_pageid) values (1211, 'Navigating Iceland',121);
insert into page (pageid, name, parent_pageid) values (1212, 'Dining and Drinking',121);
insert into page (pageid, name, parent_pageid) values (1213, 'Northern Lights',121);
insert into page (pageid, name, parent_pageid) values (1214, 'Snæfellsjökull National Park',121);
insert into page (pageid, name, parent_pageid) values (1215, 'Reykjavik',121);
insert into page (pageid, name, parent_pageid) values (1216, 'Blue Lagoon & Geo Thermal Spa',121);
insert into page (pageid, name, parent_pageid) values (1217, 'South East and Vatnajökull',121);
insert into page (pageid, name, parent_pageid) values (1218, 'Golden Circle',121);


insert into division ( divisionid  , name ,long_description, pageid) values (1,'div1','<p>What  created the biggest air traffic shut down in the last 50 years made the striking tourism boom this country. Yes that\'s the volcanic eruption of Eyjafjallajökull, Iceland in 2010. Iceland is a home to 32 active volcano site and the biggest glaciers of Europe. So now you know why it is called land of Ice and Fire and I am a fan of Game of Thrones so "A Song of Ice and Fire". Talking about which it is also site of many Game of  Thrones location.</p></br><p>Remember the scene from Game of Thrones where Jon Snow and Ygritte hooks up in a cave. That scene is from the Grjótagjá cave, in the north of Iceland.</p></br><p>Iceland has an extremely dynamic landscape and is in the mid of its own creation perhaps that\'s why it is also called the youngest country.  Its landscape consist of hardened lava covered with moss, waterfall, glaciers, gushing geysers, hot springs, beaches made up of ice rocks and ashes. It has a stark beauty which is nowhere else on the earth. Remember this it has all of this in a very small piece of land.</p>',121);

insert into division ( divisionid  , name ,long_description, pageid) values (2,'div2','<customImageTag>Gallary Component</customImageTag>',121);

insert into division ( divisionid  , name, long_description , pageid) values (3, 'div3','<p>Iceland is an extremely popular summer destination and therefore is very expensive. Although both summer and winter season have their own advantage, there are some tours and sites that are open in winter but overall there are more thing to do in summer.</br></p><p>I highly advise you to plan with some insight when going to Iceland, as there is so much to see, much distance to cover and not enough time. Moreover, given the amount of time you maybe be going for you will find it easier when everything is organized for you when you arrive as the tours are not cheap and some may not even have the availability. So planning beforehand is essential, as it will make the trip more enjoyable.</br></p><p>Most of the Iceland is navigable by a simple car so you can rent a car and chose to explore by yourself. You can refer the map I created in Navigating Iceland by your own. Also I have put description of  popular places in Iceland and some of the essential tours (in my opinion).</p>',121);


insert into media ( DTYPE , id ,name , divisionid) values ('Image',20, 'S4_MAIN_IMAGE' ,2);
insert into media ( DTYPE , id ,name , divisionid) values ('Video',21, 'S4_THUMBNAIL_VIDEO' ,2);


select * from page;
select * from division;
select * from media;
