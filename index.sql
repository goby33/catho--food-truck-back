CREATE TABLE "public"."menus" (
                                  "id_menu" serial NOT NULL,
                                  "nom" varchar,
                                  "description" varchar,
                                  "url_image" varchar,
                                  "prix" integer,
                                  "note" integer,
                                  PRIMARY KEY ("id_menu"),
                                  UNIQUE ("id_menu")
);
CREATE TABLE "public"."boissons" (
                                     "id_boissons" serial NOT NULL,
                                     "nom" varchar,
                                     "description" varchar,
                                     "url_image" varchar,
                                     "prix" integer,
                                     "note" integer,
                                     PRIMARY KEY ("id_boissons"),
                                     UNIQUE ("id_boissons")
);
CREATE TABLE "public"."plats" (
                                  "id_plat" serial NOT NULL,
                                  "nom" varchar,
                                  "description" varchar,
                                  "url_image" varchar,
                                  "prix" integer,
                                  "note" integer,
                                  PRIMARY KEY ("id_plat"),
                                  UNIQUE ("id_plat")
);
CREATE TABLE "public"."desserts" (
                                     "id_dessert" serial NOT NULL,
                                     "nom" varchar,
                                     "description" varchar,
                                     "url_image" varchar,
                                     "prix" integer,
                                     "note" integer,
                                     PRIMARY KEY ("id_dessert"),
                                     UNIQUE ("id_dessert")
);

