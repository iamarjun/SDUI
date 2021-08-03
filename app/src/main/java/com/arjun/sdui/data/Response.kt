package com.arjun.sdui.data

val choiceResponse: String = """
    {
      "id": "instant_choice_doctor_list",
      "version": 1,
      "layout": {
        "nav": {
          "type": "single_section",
          "section_details": [
           {
            "section_id": "navigation"
           }
          ]
        },
        "body": {
          "type": "multi_section",
          "section_details": [
            {
              "section_id": "filters"
            },
            {
              "section_id": "info"
            },
            {
              "section_id": "12345"
            },
            {
              "section_id": "23456"
            }
          ]
        },
        "footer": {
          "type": "single_section",
          "section_details": []
        }
      },
      "sections": [
        {
          "id": "navigation",
          "section": {
            "id": "navigation",
            "version": 1,
            "content": {
              "title": "Choose Doctor"
            },
            "interactions": {
              "on_press": {
                "actions": [
                  {
                    "element": "back_cta",
                    "type": "redirect",
                    "data": {}
                  }
                ],
                "events": [
                  {
                    "element": "back_cta",
                    "type": "pel",
                    "data": {}
                  }
                ]
              }
            }
          }
        },
        {
          "id": "info",
          "section": {
            "id": "info",
            "version": 1,
            "content": {
              "title": "Instant consultation for Knee Pain",
              "subtitle": "Treated by a specialist in Orthopedic"
            }
          }
        },
        {
          "id": "filters",
          "section": {
            "id": "filter_1",
            "version": 1,
            "content": {
              "first_cta_text": "Availability",
              "second_cta_text": "Language"
            },
            "interactions": {
              "on_press": {
                "actions": [
                  {
                    "element": "first_cta",
                    "type": "open_bottom_sheet",
                    "data": {
                      "bottom_sheet_id": "availability"
                    }
                  },
                  {
                    "element": "second_cta",
                    "type": "open_bottom_sheet",
                    "data": {
                      "bottom_sheet_id": "language"
                    }
                  }
                ],
                "events": [
                  {
                    "element": "first_cta",
                    "type": "pel",
                    "data": {}
                  },
                  {
                    "element": "second_cta",
                    "type": "pel",
                    "data": {}
                  }
                ]
              },
              "on_view": {
                "events": [
                  {
                    "element": "filter_1",
                    "type": "pel",
                    "data": {}
                  }
                ]
              }
            }
          }
        },
        {
          "id": "12345",
          "section": {
            "id": "card_1",
            "version": "v1",
            "content": {
              "image_url": "https://images.theconversation.com/files/304957/original/file-20191203-66986-im7o5.jpg?ixlib=rb-1.1.0&q=45&auto=format&w=1200&h=1200.0&fit=crop",
              "title": "Dr. Saraswati Viswanathan",
              "subtitle": "Orthopedist",
              "header_line_1": "BOLD",
              "header_line_2": "BOLD Rated by 1237 patients",
              "header_line_2_icon": "https://www.clipartmax.com/png/full/12-124030_star-green-favorite-clip-art-green-star-icon-png.png",
              "body_line_1": "Speaks: English, Hindi, Marathi, Tamil",
              "body_line_1_icon": "https://image_url",
              "body_line_2": "22876 Consultations",
              "body_line_2_icon": "https://image_url",
              "body_line_3": "₹249 Consultation fee",
              "body_line_3_icon": "https://image_url",
              "primary_cta_text": "Consult Now"
            },
            "modifiers": {
              "bold": [
                {
                  "element": "header_line_1",
                  "identifier": "BOLD",
                  "display_text": "24 years experience"
                },
                {
                  "element": "header_line_2",
                  "identifier": "BOLD",
                  "display_text": "4.8"
                }
              ]
            },
            "interactions": {
              "on_press": {
                "actions": [
                  {
                    "element": "primary_cta",
                    "type": "redirect",
                    "data": {
                      "url": "practo.com/consult-payment-summary"
                    }
                  },
                  {
                    "element": "header",
                    "type": "redirect",
                    "data": {
                      "url": "practo.com/doctor-profile"
                    }
                  }
                ],
                "events": [
                  {
                    "element": "primary_cta",
                    "type": "pel",
                    "data": {}
                  },
                  {
                    "element": "header",
                    "type": "pel",
                    "data": {}
                  }
                ]
              },
              "on_view": {
                "events": [
                  {
                    "element": "card_1",
                    "type": "pel",
                    "data": {}
                  }
                ]
              }
            }
          }
        },
        {
          "id": "23456",
          "section": {
            "id": "card_1",
            "version": "v1",
            "content": {
              "image_url": "https://www.asterbangalore.com/aster-rv-jp-nagar/aster-rv-admin/assets/images/doctor/dr-smrithi-nayak-best-fertility-doctor-bangalore-31.png",
              "title": "Dr. Venugopal M.S",
              "subtitle": "Orthopedist",
             "header_line_1": "BOLD",
              "header_line_2": "BOLD Rated by 1237 patients",
              "header_line_2_icon": "https://www.clipartmax.com/png/full/12-124030_star-green-favorite-clip-art-green-star-icon-png.png",
              "body_line_1": "Speaks: English, Hindi, Marathi, Tamil",
              "body_line_1_icon": "https://image_url",
              "body_line_2": "22876 Consultations",
              "body_line_2_icon": "https://image_url",
              "body_line_3": "₹249 Consultation fee",
              "body_line_3_icon": "https://image_url",
              "primary_cta_text": "Consult Now"
            },
            "modifiers": {
              "bold": [
                {
                  "element": "header_line_1",
                  "identifier": "BOLD",
                  "display_text": "14 years experience"
                },
                {
                  "element": "header_line_2",
                  "identifier": "BOLD",
                  "display_text": "4.6"
                }
              ]
            },
            "interactions": {
              "on_press": {
                "actions": [
                  {
                    "element": "primary_cta",
                    "type": "redirect",
                    "data": {
                      "url": "practo.com/consult-payment-summary"
                    }
                  },
                  {
                    "element": "header",
                    "type": "redirect",
                    "data": {
                      "url": "practo.com/doctor-profile"
                    }
                  }
                ],
                "events": [
                  {
                    "element": "primary_cta",
                    "type": "pel",
                    "data": {}
                  },
                  {
                    "element": "header",
                    "type": "pel",
                    "data": {}
                  }
                ]
              },
              "on_view": {
                "events": [
                  {
                    "element": "card_1",
                    "type": "pel",
                    "data": {}
                  }
                ]
              }
            }
          }
        }
      ],
      "page_meta": {
        "page_number": 1
      }
    }
""".trimIndent()
