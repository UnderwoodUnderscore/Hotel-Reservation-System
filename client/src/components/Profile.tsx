export default function Profile() {

    /**
     * User Profiles:
     *     Enable users to view and update their personal information,
     *     including saved bookings, payment details, and preferences.
     */

    return (
        <>
            <form id="profileForm">
                <label htmlFor="name">Name</label>
                <input type="text"></input>
            </form>
            <li>
                <a href=''>Go to saved bookings</a>
            </li>
            <li>
                <a href=''>See payment details</a>
            </li>
            <li>
                <a href=''>Preferences</a>
            </li>
        </>
    )
}