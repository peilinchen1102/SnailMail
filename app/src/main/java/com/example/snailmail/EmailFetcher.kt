package com.example.snailmail

class EmailFetcher {
    companion object {
        val senders = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        val title = listOf("Quick update", "Following up", "Important news", "Scheduling a call", "Reminder", "Thank you", "Request for assistance", "Checking in", "Good news", "Important matter", "Important information", "Meeting follow-up", "Updates", "Discussion request", "Important announcement")
        val summary = listOf("Hey, how's it going? I hope you're doing well. I was just thinking about you and wanted to reach out to see how you're doing. Let me know if you're free for a call sometime this week, I'd love to catch up.", "What's up? I hope you're having a good day so far. I wanted to reach out and see if you're free to grab lunch or coffee sometime this week. Let me know!", "How was your day today? I hope it went well. I was just thinking about you and wanted to check in. Is everything okay? Let me know if there's anything I can help with.", "Just wanted to check in and see how you're doing. I hope everything is going well for you. If you need anything, don't hesitate to reach out.", "Can't wait to see you! I miss our conversations and laughs. Let's plan a date soon.", "Miss you already! I hope you're having a good day. Let's catch up soon.", "Thinking of you today and hoping all is well. Let me know if you need anything.", "What are you up to today? I hope you're taking care of yourself and having a good day.", "Hope you're having a good day! Just wanted to reach out and see if you need anything.", "Let's catch up soon! I miss our conversations and can't wait to hear all about what's going on in your life.", "I hope this message finds you well. I was just thinking about you and wanted to reach out to see how you're doing.", "Just wanted to send a quick message and see how you're doing. I hope everything is going well for you.", "I wanted to thank you for always being there for me. You're such a great friend and I'm grateful for your support.", "Can we schedule a call sometime this week? I'd love to catch up and hear about what's been going on in your life.", "I hope you're having a good day today. Just wanted to reach out and see if there's anything I can help with.", "Let's plan a date soon! I miss our conversations and can't wait to hear all about what's been going on in your life.")


            //Return initial list of 10 emails
        fun getEmails(): MutableList<Email> {
            var emails : MutableList<Email> = ArrayList()
            for (i in 0..9) {
                val email = Email(senders[i], title[i], summary[i])
                emails.add(email)
            }
            return emails
        }

        // Return next 5 emails
        fun getNext5Emails(): MutableList<Email> {
            var newEmails : MutableList<Email> = ArrayList()
            for (i in 10..14) {
                val email = Email(senders[i], title[i], summary[i])
                newEmails.add(email)
            }
            return newEmails
        }
    }
}