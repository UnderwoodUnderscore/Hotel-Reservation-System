import HamburgerMenu from './HamburgerMenu';

export default function Header() {

    return (
        <>
            <header className="header">
                <img className="logo" src='https://picsum.photos/40/40' />
                <HamburgerMenu />
            </header>
        </>
    )
}